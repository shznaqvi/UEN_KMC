package edu.aku.hassannaqvi.uen_kmc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import java.util.ArrayList;
import java.util.Collection;

import edu.aku.hassannaqvi.lhwevaluation.models.Districts;
import edu.aku.hassannaqvi.lhwevaluation.models.HealthFacilities;
import edu.aku.hassannaqvi.lhwevaluation.models.Tehsil;
import edu.aku.hassannaqvi.uen_kmc.MainActivity;
import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivityFcIdentificationBinding;
import edu.aku.hassannaqvi.uen_kmc.models.Form;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3Activity;


public class FCIdentificationActivity extends AppCompatActivity {
    private static final String TAG = "LhwIdentificationActivi";
    ActivityFcIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> distNames;
    private ArrayList<String> distCodes;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> tehsilCodes;
    private ArrayList<String> healthFacilityNames;
    private ArrayList<String> healthFacilityCodes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);*/
        bi = DataBindingUtil.setContentView(this, R.layout.activity_fc_identification);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();

        populateSpinner();

    }

    private void populateSpinner() {

        Collection<Districts> districts = db.getAllDistricts();
        distNames = new ArrayList<>();
        distCodes = new ArrayList<>();

        distNames.add("...");
        distCodes.add("...");

        for (Districts d : districts) {
            distNames.add(d.getDistrictName());
            distCodes.add(d.getDistrictCode());
        }
        if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {
            distNames.add("Test Dist 9");
            distNames.add("Test Dist 8");
            distNames.add("Test Dist 7");
            distCodes.add("9");
            distCodes.add("8");
            distCodes.add("7");
        }

        // Apply the adapter to the spinner
        bi.f3109.setAdapter(new ArrayAdapter<>(FCIdentificationActivity.this, R.layout.custom_spinner, distNames));


        bi.f3109.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.f3104.setAdapter(null);
                bi.f3106.setAdapter(null);
                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                //  bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                //  bi.checkHousehold.setEnabled(true);

                if (position == 0) return;
                Collection<Tehsil> tehsil = db.getTehsilByDist(distCodes.get(position));
                tehsilNames = new ArrayList<>();
                tehsilCodes = new ArrayList<>();
                tehsilNames.add("...");
                tehsilCodes.add("...");

                for (Tehsil v : tehsil) {
                    tehsilNames.add(v.getTehsilName());
                    tehsilCodes.add(v.getTehsilCode());
                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    tehsilNames.add("Test Tehsil 1 " + distNames.get(position));
                    tehsilNames.add("Test Tehsil 2 " + distNames.get(position));
                    tehsilNames.add("Test Tehsil 3 " + distNames.get(position));
                    tehsilCodes.add(distCodes.get(position) + "001");
                    tehsilCodes.add(distCodes.get(position) + "002");
                    tehsilCodes.add(distCodes.get(position) + "003");
                }
                // Apply the adapter to the spinner
                bi.f3104.setAdapter(new ArrayAdapter<>(FCIdentificationActivity.this, R.layout.custom_spinner, tehsilNames));


                bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.gray));
                bi.btnContinue.setEnabled(false);
                //  bi.checkHousehold.setBackgroundTintList(ContextCompat.getColorStateList(IdentificationActivity.this, R.color.colorAccent));
                //  bi.checkHousehold.setEnabled(true);

                if (position == 0) return;
                Collection<HealthFacilities> healthFacility = db.getHealthFacilityByDist(distCodes.get(position));
                healthFacilityNames = new ArrayList<>();
                healthFacilityCodes = new ArrayList<>();
                healthFacilityNames.add("...");
                healthFacilityCodes.add("...");

                for (HealthFacilities hf : healthFacility) {
                    healthFacilityNames.add(hf.getHfName());
                    healthFacilityCodes.add(hf.getHfCode());
                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    healthFacilityNames.add("Test HealthFacility 1 " + distNames.get(position));
                    healthFacilityNames.add("Test HealthFacility 2 " + distNames.get(position));
                    healthFacilityNames.add("Test HealthFacility 3 " + distNames.get(position));
                    healthFacilityCodes.add(distCodes.get(position) + "001");
                    healthFacilityCodes.add(distCodes.get(position) + "002");
                    healthFacilityCodes.add(distCodes.get(position) + "003");
                }
                // Apply the adapter to the spinner
                bi.f3106.setAdapter(new ArrayAdapter<>(FCIdentificationActivity.this, R.layout.custom_spinner, healthFacilityNames));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


        bi.f3104.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


        bi.f3106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position != 0) {

                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.colorAccent));
                    bi.btnContinue.setEnabled(true);

                } else {
                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.gray));
                    bi.btnContinue.setEnabled(false);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        MainApp.form.populateMeta();
//        if (!hhExists())
        saveDraftLHWForm();
        if (!MainApp.form.getSynced().equals("")) {
            Toast.makeText(this, getString(R.string.lhw_locked), Toast.LENGTH_SHORT).show();
        } else {
            startActivity(new Intent(this, SectionF3Activity.class));
            finish();

        }
    }


    public void btnEnd(View view) {

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }

/*    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }*/

/*    private boolean hhExists() {
        MainApp.form = new Form();
        try {
            MainApp.form = db.getLHWFormByLHWCode(lhwCodes.get(bi.a104.getSelectedItemPosition()));

        } catch (JSONException e) {
            Log.d(TAG, getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(this, getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return MainApp.form != null;
    }*/

    private void saveDraftLHWForm() {
        MainApp.form = new Form();
/*        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);*/

        MainApp.form.setF3109(distNames.get(bi.f3109.getSelectedItemPosition()));
        MainApp.form.setF3104(tehsilNames.get(bi.f3104.getSelectedItemPosition()));
        MainApp.form.setF3106(healthFacilityNames.get(bi.f3106.getSelectedItemPosition()));

    }

}