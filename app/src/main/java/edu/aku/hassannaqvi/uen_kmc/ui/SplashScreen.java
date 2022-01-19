package edu.aku.hassannaqvi.uen_kmc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import edu.aku.hassannaqvi.uen_kmc.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {
            textProject();
        }, 5000);
    }

    private void textProject() {

        TextView textview = findViewById(R.id.projectName);
        textview.setVisibility(View.VISIBLE);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext()
                , R.anim.float_in);
        textview.setAnimation(animation);
        nextActivity();
    }


    private void nextActivity() {

        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashScreen.this, LoginActivity.class));
            finish();
        }, 1500);
    }

}