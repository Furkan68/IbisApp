package com.nkdroid.ibisapp;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lc);

        Typeface font = Typeface.createFromAsset(getAssets(), "Helvetica_Light.ttf");
        View view = getLayoutInflater().inflate(R.layout.actionbar,
                null);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(view);
        Toolbar parent = (Toolbar) view.getParent(); parent.setContentInsetsAbsolute(0, 0);
        TextView t = (TextView) findViewById(R.id.title_text);
        t.setText("Loyalty Card");
        t.setTypeface(font);

        ImageButton btn = (ImageButton)findViewById(R.id.abButton);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(LcActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
