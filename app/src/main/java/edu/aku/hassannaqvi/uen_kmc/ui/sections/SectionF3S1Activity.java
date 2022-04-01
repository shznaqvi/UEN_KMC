package edu.aku.hassannaqvi.uen_kmc.ui.sections;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.followup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.Collection;

import edu.aku.hassannaqvi.lhwevaluation.models.HealthFacilities;
import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivitySectionF3S1Binding;

public class SectionF3S1Activity extends AppCompatActivity {
    private static final String TAG = "SectionF3S1Activity";
    ActivitySectionF3S1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> healthFacilityNames, healthFacilityCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f3_s1);
        bi.setForm(followup);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        populateSpinner();
    }

    private void populateSpinner() {

        Collection<HealthFacilities> healthFacility = db.getHealthFacilityByDist(MainApp.user.getDist_id());

        healthFacilityNames = new ArrayList<>();
        healthFacilityCodes = new ArrayList<>();
        healthFacilityNames.add("...");
        healthFacilityCodes.add("...");

        for (HealthFacilities hf : healthFacility) {
            healthFacilityNames.add(hf.getHfName());
            healthFacilityCodes.add(hf.getHfCode());
        }

        if (MainApp.user.getUserName().contains("test") || MainApp.user.getUserName().contains("dmu")) {
            healthFacilityNames.add("Test Facility 1");
            healthFacilityNames.add("Test Facility 2");
            healthFacilityNames.add("Test Facility 3");

            healthFacilityCodes.add("001");
            healthFacilityCodes.add("002");
            healthFacilityCodes.add("003");
        }
        // Apply the adapter to the spinner
        bi.f3102.setAdapter(new ArrayAdapter<>(SectionF3S1Activity.this, R.layout.custom_spinner, healthFacilityNames));
    }

    private boolean insertNewRecord() {
        if (!followup.getUid().equals("")) return true;
        followup.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addFollowUps(followup);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        followup.setId(String.valueOf(rowId));
        if (rowId > 0) {
            followup.setUid(followup.getDeviceId() + followup.getId());
            db.updatesFollupColumn(TableContracts.FollowUpTable.COLUMN_UID, followup.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean updateDB() {
        DatabaseHelper db = MainApp.appInfo.getDbHelper();
        int updcount = 0;
        try {
            updcount = db.updatesFollupColumn(TableContracts.FollowUpTable.COLUMN_SF3, followup.sF3toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionF3S2Activity.class).putExtra("complete", true));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    public void btnEnd(View view) {
        finish();
//        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }
}