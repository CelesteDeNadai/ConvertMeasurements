package com.example.convertmeasurements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private static final String DISTANCE_METER = "distanceMeter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        convertFeet();
    }

    public void convertFeet() {

        TextView feetView = (TextView) findViewById(R.id.textViewFeet);

        TextView headingView = (TextView) findViewById(R.id.textView_label);

        double distanceMeter = getIntent().getDoubleExtra(DISTANCE_METER,0.0);

        double distanceFeet = distanceMeter * 3.28084;

        feetView.setText(getString(R.string.formatFeet,distanceFeet));

        headingView.setText(getString(R.string.message_heading2, distanceMeter));
    }
}
