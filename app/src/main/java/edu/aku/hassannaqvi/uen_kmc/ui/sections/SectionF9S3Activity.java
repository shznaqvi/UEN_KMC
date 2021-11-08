package edu.aku.hassannaqvi.uen_kmc.ui.sections;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.form;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Clear;
import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivitySectionF9S3Binding;
import edu.aku.hassannaqvi.uen_kmc.ui.EndingActivity;

public class SectionF9S3Activity extends AppCompatActivity {
    private static final String TAG = "SectionF9S3Activity";
    ActivitySectionF9S3Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f9_s3);
        bi.setCallback(this);
        bi.setForm(form);
        db = MainApp.appInfo.dbHelper;
    }


    public void f9305aOnTextChanged(CharSequence s, int start, int before, int count) {
        if (!bi.f9305a.isRangeTextValidate())
            return;

        if (Double.parseDouble(bi.f9305a.getText().toString()) >= 38.00 || Double.parseDouble(bi.f9305a.getText().toString()) <= 35.5) {
            bi.f9305b.setEnabled(true);
        } else {
            Clear.clearAllFields(bi.f9305b);
            bi.f9305b.setEnabled(false);
        }
    }


    public void f9306OnTextChanged(CharSequence s, int start, int before, int count) {
        if (!bi.f9306.isRangeTextValidate())
            return;
        if (Integer.parseInt(bi.f9306.getText().toString()) >= 60) {
            bi.fldGrpCVf9307.setVisibility(View.VISIBLE);
        } else {
            Clear.clearAllFields(bi.fldGrpCVf9307);
            bi.fldGrpCVf9307.setVisibility(View.GONE);
        }
    }


    private boolean updateDB() {
        db = MainApp.appInfo.getDbHelper();
        long updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SF9, form.sF9toString());
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
            startActivity(new Intent(this, SectionF9S4Activity.class).putExtra("complete", true));
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