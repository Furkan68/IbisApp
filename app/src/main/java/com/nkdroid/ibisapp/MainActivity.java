package com.nkdroid.ibisapp;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


import com.nkdroid.ibisapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = getLayoutInflater().inflate(R.layout.actionbar,
                null);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(view);
        Toolbar parent = (Toolbar) view.getParent(); parent.setContentInsetsAbsolute(0, 0);
        TextView t = (TextView) findViewById(R.id.title_text);
        t.setText("Home");

        final ImageButton SwipeButton = (ImageButton) findViewById(R.id.swipebutton);
        final ImageButton LcButton = (ImageButton) findViewById(R.id.lcbutton);
        final ImageButton SettingsButton = (ImageButton) findViewById(R.id.settingsbutton);

        SwipeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SwipeCardsActivity.class);
                startActivity(i);
            }
        });

        LcButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LcActivity.class);
                startActivity(i);
            }
        });

        SettingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(i);
            }
        });

    }
}
