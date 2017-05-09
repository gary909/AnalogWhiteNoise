package com.example.android.analogwhitenoise;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INFO HERE
        // Find the View that shows the info category
        TextView info = (TextView) findViewById(R.id.info);

        // Set a click listener on that View
        info.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link InfoActivity}
                Intent infoIntent = new Intent(MainActivity.this, infoActivity.class);

                // Start the new activity
                startActivity(infoIntent);
            }
        });

        //SEA HERE
        // Find the View that shows the sea category
        TextView sea = (TextView) findViewById(R.id.sea);

        // Set a click listener on that View
        sea.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SeaActivity}
                Intent seaIntent = new Intent(MainActivity.this, SeaActivity.class);

                // Start the new activity
                startActivity(seaIntent);
            }
        });

        //WIND HERE
        // Find the View that shows the wind category
        TextView wind = (TextView) findViewById(R.id.wind);

        // Set a click listener on that View
        wind.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SeaActivity}
                Intent windIntent = new Intent(MainActivity.this, WindActivity.class);

                // Start the new activity
                startActivity(windIntent);
            }
        });

        //FAN HERE
        // Find the View that shows the wind category
        TextView fan = (TextView) findViewById(R.id.fan);

        // Set a click listener on that View
        fan.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SeaActivity}
                Intent fanIntent = new Intent(MainActivity.this, FanActivity.class);

                // Start the new activity
                startActivity(fanIntent);
            }
        });

        //AIR HERE
        // Find the View that shows the wind category
        TextView air = (TextView) findViewById(R.id.air);

        // Set a click listener on that View
        air.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SeaActivity}
                Intent airIntent = new Intent(MainActivity.this, AirActivity.class);

                // Start the new activity
                startActivity(airIntent);
            }
        });

        //BUY HERE
        // Find the View that shows the wind category
        TextView buy = (TextView) findViewById(R.id.buy);

        // Set a click listener on that View
        buy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SeaActivity}
                Intent buyIntent = new Intent(MainActivity.this, buyActivity.class);

                // Start the new activity
                startActivity(buyIntent);
            }
        });
    }
}
