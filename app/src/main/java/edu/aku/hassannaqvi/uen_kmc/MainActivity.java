package edu.aku.hassannaqvi.uen_kmc;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static edu.aku.hassannaqvi.uen_kmc.core.MainApp.sharedPref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.AndroidDatabaseManager;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.uen_kmc.models.FollowUp;
import edu.aku.hassannaqvi.uen_kmc.models.Form;
import edu.aku.hassannaqvi.uen_kmc.ui.ChangePasswordActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.FCIdentificationActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.SyncActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.WebViewActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.lists.DISCFormActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF1S1Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF1S2Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF1S3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF1S4Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF1S5Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF2S2Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF2S3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF2S4Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3S1Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3S2Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3S3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3S4Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3S6Activity;
import edu.aku.hassannaqvi.uen_kmc.utils.Utils;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bi.setCallback(this);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);

        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");

        try {
            String pwExpiry = String.valueOf(new JSONObject(MainApp.user.getPwdExpiry()).get("date")).substring(0, 10);
            //     Toast.makeText(this, pwExpiry, Toast.LENGTH_LONG).show();
            Log.d(TAG, "onCreate: pwExpiry: " + pwExpiry);

            Calendar cal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            cal.setTime(sdf.parse(pwExpiry));// all done

            int daysLeft = (int) MILLISECONDS.toDays(cal.getTimeInMillis() - System.currentTimeMillis());
            //  Toast.makeText(this, daysLeft+" Days left", Toast.LENGTH_LONG).show();
            if (daysLeft < 1) {
                Toast.makeText(this, "Your password has expired. Please contact your supervisor.", Toast.LENGTH_LONG).show();
                finish();
            }
            if (daysLeft < 10) {
                bi.newApp.setText("Your current password is expiring in " + daysLeft + " day(s) on " + pwExpiry + ". Please change your password to avoid account lockout. (Internet Required.)");
                // bi.message.setText("Your password will expire on " + pwExpiry + ". There are only " + daysLeft + " Days left.");
                bi.newApp.setVisibility(View.VISIBLE);
            } else {
                bi.newApp.setVisibility(View.GONE);
            }

        } catch (JSONException | ParseException e) {
            e.printStackTrace();
        }


        String latestVersionName = sharedPref.getString("versionName", "");
        int latestVersionCode = Integer.parseInt(sharedPref.getString("versionCode", "0"));

        if (MainApp.appInfo.getVersionCode() < latestVersionCode) {
            bi.newApp.setVisibility(View.VISIBLE);
            bi.newApp.setText("NOTICE: There is a newer version of this app available on server (" + latestVersionName + latestVersionCode + "). \nPlease download update the app now.");
        } else {
            bi.newApp.setVisibility(View.GONE);

        }
    }

    public void sectionPress(View view) {

        switch (view.getId()) {
            case R.id.openFormCS:
                MainApp.idType = 1;
                break;
            case R.id.openFormDIS:
                MainApp.idType = 2;
                break;
            case R.id.openFollowUp:
                MainApp.idType = 3;
                break;
            default:
                MainApp.idType = 0;

        }


        switch (view.getId()) {

            case R.id.openFormCS:
                MainApp.form = new Form();
                startActivity(new Intent(this, FCIdentificationActivity.class));
                break;
            case R.id.seca1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF1S1Activity.class));
                break;
            case R.id.seca2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF1S2Activity.class));
                break;
            case R.id.seca3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF1S3Activity.class));
                break;
            case R.id.seca4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF1S4Activity.class));
                break;
            case R.id.seca5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF1S5Activity.class));
                break;
            case R.id.openFormDIS:
                MainApp.form = new Form();
                startActivity(new Intent(this, DISCFormActivity.class));
//                startActivity(new Intent(this, SectionF2S1Activity.class));
                break;
            case R.id.secb1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF2S2Activity.class));
                break;
            case R.id.secb2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF2S3Activity.class));
                break;
            case R.id.secb3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF2S4Activity.class));
                break;
            case R.id.openFollowUp:
                MainApp.followup = new FollowUp();
                startActivity(new Intent(this, SectionF3S1Activity.class));
//                startActivity(new Intent(this, FollowUpsListActivity.class));
                break;
            case R.id.secb5:
                MainApp.followup = new FollowUp();
                startActivity(new Intent(this, SectionF3S2Activity.class));
                break;
            case R.id.secb6:
                MainApp.followup = new FollowUp();
                startActivity(new Intent(this, SectionF3S3Activity.class));
                break;
            case R.id.secc1:
                MainApp.followup = new FollowUp();
                startActivity(new Intent(this, SectionF3S4Activity.class));
                break;
            case R.id.secc2:
                MainApp.followup = new FollowUp();
                startActivity(new Intent(this, SectionF3S6Activity.class));
                break;
            case R.id.dbManager:
                startActivity(new Intent(this, AndroidDatabaseManager.class));
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidDatabaseManager.class);
                startActivity(intent);
                break;
            case R.id.debugDB:
                intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
                break;
            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
        /*    case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;*/
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;
    }

    public void showDebugDbAddress(View view) {
        Utils.showDebugDBAddressLogToast(getApplicationContext());
    }

}