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
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivitySectionF6S4Binding;
import edu.aku.hassannaqvi.uen_kmc.ui.EndingActivity;

public class SectionF6S4Activity extends AppCompatActivity {
    private static final String TAG = "SectionF6S4Activity";
    ActivitySectionF6S4Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f6_s4);
        bi.setCallback(this);
        bi.setForm(form);
        db = MainApp.appInfo.dbHelper;
    }


    public void f6401OnTextChanged(CharSequence s, int start, int before, int count) {
        if (!bi.f64011.isRangeTextValidate())
            return;

        if (Double.parseDouble(bi.f64011.getText().toString()) >= 38.00 || Double.parseDouble(bi.f64011.getText().toString()) <= 35.5) {
            bi.f64012.setEnabled(true);
        } else {
            Clear.clearAllFields(bi.f64012);
            bi.f64012.setEnabled(false);
        }
    }


    public void f6402OnTextChanged(CharSequence s, int start, int before, int count) {
        if (!bi.f6402.isRangeTextValidate())
            return;
        if (Integer.parseInt(bi.f6402.getText().toString()) >= 60) {
            bi.fldGrpCVf6403.setVisibility(View.VISIBLE);
        } else {
            Clear.clearAllFields(bi.fldGrpCVf6403);
            bi.fldGrpCVf6403.setVisibility(View.GONE);
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
            startActivity(new Intent(this, SectionF6S5Activity.class).putExtra("complete", true));
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