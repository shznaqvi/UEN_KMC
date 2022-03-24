package edu.aku.hassannaqvi.uen_kmc.ui.lists;

import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.followup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import org.json.JSONException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import edu.aku.hassannaqvi.uen_kmc.R;
import edu.aku.hassannaqvi.uen_kmc.adapters.FollowUpsScheAdapter;
import edu.aku.hassannaqvi.uen_kmc.contracts.TableContracts;
import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.DatabaseHelper;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivityFollowupsListBinding;

public class FollowUpsListActivity extends AppCompatActivity {

    ActivityFollowupsListBinding bi;
    DatabaseHelper db;
    String sysdateToday = new SimpleDateFormat("dd-MM-yy").format(new Date());
    private FollowUpsScheAdapter followUpsScheAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_followups_list);
        //recyclerView = findViewById(R.id.fc_recycler_view);
//        setSupportActionBar(bi.toolbar);
        //getSupportActionBar().setDisplayUseLogoEnabled(true);


        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        //  bi.fcRecyclerView.setHasFixedSize(true);

        db = MainApp.appInfo.dbHelper;
        try {
            MainApp.fupsSche = db.getAllFollowUpsSche();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(FollowUpsSche)", Toast.LENGTH_SHORT).show();
        }

        // specify an adapter (see also next example)
        followUpsScheAdapter = new FollowUpsScheAdapter(this);
        bi.fcRecyclerView.setAdapter(followUpsScheAdapter);
        bi.fcRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        bi.fupFor.setText(" ( ALL )");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1002) {
            if (followup.getiStatus().equals("1")) {
                db.updatesFollowupsScheColumn(TableContracts.FollowupsScheTable.COLUMN_FP_DONE, followup.getSysDate());
                MainApp.fupsSche.get(MainApp.position).setFupdonedt(followup.getSysDate());
                followUpsScheAdapter.notifyItemChanged(MainApp.position);
            } else {
                Toast.makeText(this, "Followup was not recorded.", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void filterForms(View view) {
        bi.memberFilter.setError(null);
        if (bi.memberFilter.getText().toString().length() == 5) {
            Toast.makeText(FollowUpsListActivity.this, "Followups list updated", Toast.LENGTH_SHORT).show();

            try {
                MainApp.fupsSche = db.getFollowUpsScheByMemberID(bi.memberFilter.getText().toString());
                followUpsScheAdapter.notifyDataSetChanged();
                Toast.makeText(FollowUpsListActivity.this, MainApp.fupsSche.size() + " followups found.", Toast.LENGTH_SHORT).show();
                bi.fupFor.setText(" ( " + bi.memberFilter.getText().toString() + " )");

            } catch (JSONException e) {
                e.printStackTrace();
                Toast.makeText(FollowUpsListActivity.this, "JSONException(FollowupsSche)", Toast.LENGTH_SHORT).show();
            }

            //followUpsScheAdapter = new FollowUpsScheAdapter(FollowUpsListActivity.this, (List<FollowUpsSche>) MainApp.fupsSche);
            bi.fcRecyclerView.setAdapter(followUpsScheAdapter);
        } else {
            bi.memberFilter.setError("Invalid ID");
            Toast.makeText(FollowUpsListActivity.this, "Invalid ID", Toast.LENGTH_SHORT).show();

        }

    }

    public void filterNumber(View view) {

        int round = 0;
        MainApp.fupsSche = new ArrayList<>();
        followUpsScheAdapter.notifyDataSetChanged();

        switch (view.getId()) {
            case R.id.f1:
                round = 1;
                break;
            case R.id.f2:
                round = 2;
                break;
        }

        Toast.makeText(FollowUpsListActivity.this, "Followups list updated", Toast.LENGTH_SHORT).show();

        try {
            MainApp.fupsSche = db.getFollowUpsScheByRound(round);
            followUpsScheAdapter.notifyDataSetChanged();

            Toast.makeText(FollowUpsListActivity.this, MainApp.fupsSche.size() + " followups found.", Toast.LENGTH_SHORT).show();
            bi.fupFor.setText(" ( Round " + round + " )");

        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(FollowUpsListActivity.this, "JSONException(FollowupsSche)", Toast.LENGTH_SHORT).show();
        }

        //followUpsScheAdapter = new FollowUpsScheAdapter(FollowUpsListActivity.this, (List<FollowUpsSche>) MainApp.fupsSche);
        //followUpsScheAdapter.notifyDataSetChanged();
        bi.fcRecyclerView.setAdapter(followUpsScheAdapter);

    }
}