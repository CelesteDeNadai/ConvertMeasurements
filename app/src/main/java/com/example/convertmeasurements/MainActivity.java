package com.example.convertmeasurements;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String DISTANCE_METER = "distanceMeter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertToFeet(View view) {

        Intent convertIntent = new Intent(this, SecondActivity.class);

        TextView numberTextView = (TextView) findViewById(R.id.EnterValue);

        // Get the value of the text view.
        String numberString = numberTextView.getText().toString();

        // Convert the distance to an double
        double distanceMeter = Double.parseDouble(numberString);

        // Add the count to the extras for the Intent.
        convertIntent.putExtra(DISTANCE_METER, distanceMeter);

        // Start the new activity.
        startActivity(convertIntent);
    }
}
