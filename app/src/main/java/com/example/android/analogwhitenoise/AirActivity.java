package com.example.android.analogwhitenoise;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class AirActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air);

        MediaPlayer oldiesMusic = MediaPlayer.create(this, R.raw.noiseair);

        oldiesMusic.start();
    }
}
