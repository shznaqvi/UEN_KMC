package edu.aku.hassannaqvi.uen_kmc.ui.sections;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
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
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivitySectionF6S7Binding;
import edu.aku.hassannaqvi.uen_kmc.ui.EndingActivity;

public class SectionF6S7Activity extends AppCompatActivity {
    private static final String TAG = "SectionF6S7Activity";
    ActivitySectionF6S7Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f6_s7);
        bi.setCallback(this);
        bi.setForm(form);
    }


    public void setSkip(CharSequence s, int i, int i1, int i2) {
        if (TextUtils.isEmpty(bi.f6704.getText()))
            return;
        if (Integer.parseInt(bi.f6704.getText().toString()) > 0) {
            bi.fldGrpCVf6705.setVisibility(View.GONE);
            bi.fldGrpCVf6706.setVisibility(View.GONE);
        } else {
            bi.fldGrpCVf6705.setVisibility(View.VISIBLE);
            bi.fldGrpCVf6706.setVisibility(View.VISIBLE);
        }
    }


    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SF6, form.sF6toString());
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d(TAG, R.string.upd_db + e.getMessage());
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount > 0) return true;
        else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionF7S1Activity.class).putExtra("complete", true));
        } else Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
    }


    private void saveDraft() {
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}