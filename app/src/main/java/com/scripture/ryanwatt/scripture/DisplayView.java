package com.scripture.ryanwatt.scripture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_view);

        TextView textView = (TextView) findViewById(R.id.textView_result);
        Bundle bundle = getIntent().getExtras();

        textView.setText(bundle.getString("reference"));


    }
}
