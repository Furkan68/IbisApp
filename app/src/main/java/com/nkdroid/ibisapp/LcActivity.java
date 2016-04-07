package com.nkdroid.ibisapp;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc);

        View view = getLayoutInflater().inflate(R.layout.actionbar,
                null);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(view);
        Toolbar parent = (Toolbar) view.getParent(); parent.setContentInsetsAbsolute(0, 0);
        TextView t = (TextView) findViewById(R.id.title_text);
        t.setText("Loyalty Card");
    }
}
