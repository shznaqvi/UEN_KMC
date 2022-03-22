package edu.aku.hassannaqvi.uen_kmc.ui;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import java.util.ArrayList;
import java.util.Collection;

import edu.aku.hassannaqvi.lhwevaluation.models.HealthFacilities;
import edu.aku.hassannaqvi.lhwevaluation.models.Tehsil;
import edu.aku.hassannaqvi.uen_kmc.MainActivity;
import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivityFcIdentificationBinding;
import edu.aku.hassannaqvi.uen_kmc.models.Form;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF1S1Activity;


public class FCIdentificationActivity extends AppCompatActivity {
    private static final String TAG = "LhwIdentificationActivi";
    ActivityFcIdentificationBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> tehsilNames;
    private ArrayList<String> tehsilCodes;
    private ArrayList<String> healthFacilityNames;
    private ArrayList<String> healthFacilityCodes;
    private ArrayList<String> ucNames;
    private ArrayList<String> ucCodes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1
                : sharedPref.getString("lang", "1").equals("1") ? R.style.AppThemeUrdu
                : R.style.AppThemeSindhi);*/
        bi = DataBindingUtil.setContentView(this, R.layout.activity_fc_identification);
        bi.setCallback(this);
        db = MainApp.appInfo.getDbHelper();
        setupSkips();

        populateSpinner();

    }

    private void setupSkips() {

        bi.f110201.setOnCheckedChangeListener((radioGroup, i) -> Clear.clearAllFields(bi.fldGrpCVf1103));

    }

    private void populateSpinner() {

        Collection<Tehsil> tehsils = db.getTehsilByDist(MainApp.user.getDist_id());
        tehsilNames = new ArrayList<>();
        tehsilCodes = new ArrayList<>();
        tehsilNames.add("...");
        tehsilCodes.add("...");

        for (Tehsil t : tehsils) {
            tehsilNames.add(t.getTehsilName());
            tehsilCodes.add(t.getTehsilCode());
        }

        if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {
            tehsilNames.add("Test Tehsil 9");
            tehsilNames.add("Test Tehsil 8");
            tehsilNames.add("Test Tehsil 7");
            tehsilCodes.add("9");
            tehsilCodes.add("8");
            tehsilCodes.add("7");
        }

        // Apply the adapter to the spinner
        bi.f1104.setAdapter(new ArrayAdapter<>(FCIdentificationActivity.this, R.layout.custom_spinner, tehsilNames));


        bi.f1104.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

//                bi.f1103.setAdapter(null);
/*
                if (bi.f110202.isChecked()) {
                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.gray));
                    bi.btnContinue.setEnabled(false);
                } else {
                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.colorAccent));
                    bi.btnContinue.setEnabled(true);
                }
*/

                if (position == 0) return;
                Collection<HealthFacilities> healthFacility = db.getHealthFacilityByTehsil(tehsilCodes.get(position));
                healthFacilityNames = new ArrayList<>();
                healthFacilityCodes = new ArrayList<>();
                healthFacilityNames.add("...");
                healthFacilityCodes.add("...");

                for (HealthFacilities hf : healthFacility) {
                    healthFacilityNames.add(hf.getHfName());
                    healthFacilityCodes.add(hf.getHfCode());
                }
                if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {

                    healthFacilityNames.add("Test Facility 1 " + tehsilNames.get(position));
                    healthFacilityNames.add("Test Facility 2 " + tehsilNames.get(position));
                    healthFacilityNames.add("Test Facility 3 " + tehsilNames.get(position));
                    healthFacilityCodes.add(tehsilCodes.get(position) + "001");
                    healthFacilityCodes.add(tehsilCodes.get(position) + "002");
                    healthFacilityCodes.add(tehsilCodes.get(position) + "003");
                }
                // Apply the adapter to the spinner
                bi.f1103.setAdapter(new ArrayAdapter<>(FCIdentificationActivity.this, R.layout.custom_spinner, healthFacilityNames));

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


        bi.f1103.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

/*                if (position != 0) {

                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.colorAccent));
                    bi.btnContinue.setEnabled(true);

                } else {
                    bi.btnContinue.setBackgroundTintList(ContextCompat.getColorStateList(FCIdentificationActivity.this, R.color.gray));
                    bi.btnContinue.setEnabled(false);
                }*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });
    }

    public void btnContinue(View view) {
        if (!formValidation()) return;
        form.populateMeta();
//        if (!hhExists())
        saveDraft();
        if (!form.getSynced().equals("")) {
            Toast.makeText(this, getString(R.string.lhw_locked), Toast.LENGTH_SHORT).show();
        } else {
            startActivity(new Intent(this, SectionF1S1Activity.class));
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


    private void saveDraft() {
        form = new Form();

        form.setF1101(bi.f1101.getText().toString());
        form.setF1102(bi.f110201.isChecked() ? "1"
                : bi.f110202.isChecked() ? "2"
                : "-1");
        form.setF1103(healthFacilityNames.get(bi.f1103.getSelectedItemPosition()));
        form.setF1104(tehsilNames.get(bi.f1104.getSelectedItemPosition()));

    }

}