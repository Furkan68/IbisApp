package com.nkdroid.ibisapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;


public class SplashActivity extends AppCompatActivity {
    private ProgressBar spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        this.getSupportActionBar().hide();

        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                //nothing
            }

            public void onFinish() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }.start();
    }


}
