package edu.aku.hassannaqvi.uen_kmc;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.uen_kmc.core.MainApp;
import edu.aku.hassannaqvi.uen_kmc.database.AndroidDatabaseManager;
import edu.aku.hassannaqvi.uen_kmc.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.uen_kmc.models.Form;
import edu.aku.hassannaqvi.uen_kmc.ui.FCIdentificationActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.SyncActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.WebViewActivity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF2Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF5S1Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF5S2Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF5S3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF5S4Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF6S1Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF6S2Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF6S3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF6S4Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF6S5Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF6S6Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF6S7Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF7S1Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF7S3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF7S4Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF7S6Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF801Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF802Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF9S1Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF9S3Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF9S4Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF9S5Activity;
import edu.aku.hassannaqvi.uen_kmc.ui.sections.SectionF9S6Activity;
import edu.aku.hassannaqvi.uen_kmc.utils.Utils;


public class MainActivity extends AppCompatActivity {

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
    }

    public void sectionPress(View view) {

        switch (view.getId()) {
            case R.id.openForm:
                MainApp.idType = 1;
                break;
        /*    case R.id.openAnthro:
                MainApp.idType = 2;
                break;

            case R.id.updateBlood:
                MainApp.idType = 3;
                break;

            case R.id.updateStool:
                MainApp.idType = 4;
                break;*/
            default:
                MainApp.idType = 0;

        }


        switch (view.getId()) {

            case R.id.openForm:
                MainApp.form = new Form();
                startActivity(new Intent(this, FCIdentificationActivity.class));
                break;
            case R.id.seca1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF2Activity.class));
                break;
            case R.id.seca2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF3Activity.class));
                break;
            case R.id.seca3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF5S1Activity.class));
                break;
            case R.id.seca4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF5S2Activity.class));
                break;
            case R.id.seca5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF5S3Activity.class));
                break;
            case R.id.seca6:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF5S4Activity.class));
                break;
            case R.id.secb1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF6S1Activity.class));
                break;
            case R.id.secb2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF6S2Activity.class));
                break;
            case R.id.secb3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF6S3Activity.class));
                break;
            case R.id.secb4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF6S4Activity.class));
                break;
            case R.id.secb5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF6S5Activity.class));
                break;
            case R.id.secb6:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF6S6Activity.class));
                break;
            case R.id.secc1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF6S7Activity.class));
                break;
            case R.id.secc2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF7S1Activity.class));
                break;
            case R.id.secc3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF7S3Activity.class));
                break;
            case R.id.secc4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF7S4Activity.class));
                break;
            case R.id.secc5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF7S6Activity.class));
                break;
            case R.id.secc6:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF801Activity.class));
                break;
            case R.id.secd1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF802Activity.class));
                break;
            case R.id.secd2:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF9S1Activity.class));
                break;
            case R.id.secd3:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF9S3Activity.class));
                break;
            case R.id.secd4:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF9S4Activity.class));
                break;
            case R.id.secd5:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF9S5Activity.class));
                break;
            case R.id.secd6:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionF9S6Activity.class));
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
        return super.onCreateOptionsMenu(menu);
    }

    public void showDebugDbAddress(View view) {
        Utils.showDebugDBAddressLogToast(getApplicationContext());
    }

}