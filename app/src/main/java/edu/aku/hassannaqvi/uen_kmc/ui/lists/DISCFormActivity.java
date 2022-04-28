package edu.aku.hassannaqvi.uen_kmc.ui.lists;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONException;

import java.util.List;

import edu.aku.hassannaqvi.uen_kmc.MainActivity;
import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.adapters.DISCFormAdapt;
import edu.aku.hassannaqvi.uen_kmc.adapters.FormListListener;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivityDiscformBinding;
import edu.aku.hassannaqvi.uen_kmc.models.Form;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF2S1Activity;


public class DISCFormActivity extends AppCompatActivity {

    private static final String TAG = "DISCFormActivity";
    ActivityDiscformBinding bi;
    DatabaseHelper db;
    List<Form> formList;
    private DISCFormAdapt discAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_household);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_discform);
        bi.setCallback(this);

        db = MainApp.appInfo.dbHelper;
        List<Form> form = db.getAllForms();

        discAdapter = new DISCFormAdapt(new FormListListener(item -> {

            try {
                MainApp.discharge = db.getDiscFormByStudyNo(item.getStudyNo());
            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(this, "JSONException(FormByStudyNo)" + e.getMessage(), Toast.LENGTH_SHORT).show();

            }
            if (!MainApp.discharge.getF2305().isEmpty()) {
                Toast.makeText(this, "Discharge form already filled", Toast.LENGTH_SHORT).show();
                bi.rvChilds.setEnabled(false);
            } else {
                finish();
                startActivity(new Intent(this, SectionF2S1Activity.class)
                        .putExtra("babyID", item.getF1111())
                        .putExtra("motherName", item.getF1112()));
            }
            return null;
        }));

        bi.rvChilds.setAdapter(discAdapter);
        discAdapter.submitList(form);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DISCFormActivity.this, MainActivity.class));
            }
        });

        formList = db.getAllFollowup("000000");
    }


    public void filterForms(View view) {
        Toast.makeText(this, "updated", Toast.LENGTH_SHORT).show();

        formList = db.getAllFollowup(bi.babyId.getText().toString());

        discAdapter.submitList(formList);
        discAdapter.notifyDataSetChanged();

    }


    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();
        discAdapter.notifyDataSetChanged();

    }


    public void btnContinue(View view) {
        finish();
        //  startActivity(new Intent(this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));

    }


    public void BtnEnd(View view) {

        finish();
        //startActivity(new Intent(this, MainActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
        /*   } else {
               Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show()
           }*/
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        //   Toast.makeText(getApplicationContext(), "Back Press Not Allowed", Toast.LENGTH_LONG).show();
    }

}