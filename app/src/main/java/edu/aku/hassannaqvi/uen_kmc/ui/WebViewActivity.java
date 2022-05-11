package edu.aku.hassannaqvi.uen_kmc.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.uen_kmc.BuildConfig;
import edu.aku.hassannaqvi.uen_kmc.R;

public class WebViewActivity extends AppCompatActivity {

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        setContentView(R.layout.activity_web_view);
        setSupportActionBar(findViewById(R.id.toolbar));

        showDebugDBAddressLogToast(getApplicationContext());

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public String showDebugDBAddressLogToast(Context context) {
        if (BuildConfig.DEBUG) {
/*            try {
                Class<?> debugDB = Class.forName("com.amitshekhar.DebugDB");
                Method getAddressLog = debugDB.getMethod("getAddressLog");
                Object value = getAddressLog.invoke(null);
                web = findViewById(R.id.webView);
                WebSettings webSettings = web.getSettings();
                webSettings.setJavaScriptEnabled(true);
                web.setWebViewClient(new WebViewClient());
                String[] seprated = DebugDB.getAddressLog().split(" ");
                web.loadUrl(seprated[1]);
            } catch (Exception ignore) {

            }*/
        }
        return null;
    }
}