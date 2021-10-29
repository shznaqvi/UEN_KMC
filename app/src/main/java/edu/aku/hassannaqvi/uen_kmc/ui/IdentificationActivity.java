package edu.aku.hassannaqvi.uen_kmc.ui;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivityIdentificationBinding;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF2Activity;

public class IdentificationActivity extends AppCompatActivity {

    private static final String TAG = "IdentificationActivity";
    ActivityIdentificationBinding bi;
    private DatabaseHelper db;
    private Intent openIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_identification);
        bi.setCallback(this);
        bi.setForm(form);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;


/*        openIntent = new Intent();
        switch (MainApp.idType) {
            case 1:
                bi.btnContinue.setText(R.string.open_hh_form);
                MainApp.form = new Form();
                openIntent = new Intent(this, SectionF2Activity.class);
                break;
        }*/
    }

    private boolean insertNewRecord() {
        if (!form.getUid().equals("")) return true;
        long rowId = 0;
        try {
            rowId = db.addForm(form);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        form.setId(String.valueOf(rowId));
        if (rowId > 0) {
            form.setUid(form.getDeviceId() + form.getId());
            db.updatesFormColumn(TableContracts.FormsTable.COLUMN_UID, form.getUid());
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
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SF2, form.sF2toString());
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

    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;
        saveDraftForm();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionF2Activity.class).putExtra("complete", true));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }

    private void saveDraftForm() {
/*        MainApp.form = new Form();

        MainApp.form.setUserName(MainApp.user.getUserName());
        MainApp.form.setSysDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).format(new Date().getTime()));
        MainApp.form.setDeviceId(MainApp.deviceid);
        MainApp.form.setAppver(MainApp.versionName + "." + MainApp.versionCode);

        MainApp.form.setF2101(bi.f2101.getText().toString());
        MainApp.form.setF2102(bi.f2102.getText().toString());
        MainApp.form.setF2103(bi.f2103.getText().toString());
        MainApp.form.setF2104(bi.f2104.getText().toString());
        MainApp.form.setF2105(bi.f2105.getText().toString());
        MainApp.form.setF2106(bi.f2106.getText().toString());
        MainApp.form.setF2107(bi.f2107.getText().toString());
        MainApp.form.setF2108(bi.f2108.getText().toString());*/
//        MainApp.form.setSno(MainApp.currentHousehold.getSno());
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}