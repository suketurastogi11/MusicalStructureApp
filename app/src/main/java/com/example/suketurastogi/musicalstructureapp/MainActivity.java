package com.example.suketurastogi.musicalstructureapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button recentActivityButton = (Button) findViewById(R.id.recent_activity_button);
        Button myMusicButton = (Button) findViewById(R.id.my_music_button);
        Button radioButton = (Button) findViewById(R.id.radio_button);
        Button settingsButton = (Button) findViewById(R.id.settings_button);

        recentActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentActivityIntent = new Intent(MainActivity.this, RecentActivity.class);
                startActivity(recentActivityIntent);
            }
        });

        myMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(MainActivity.this, MyMusic.class);
                startActivity(myMusicIntent);
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(MainActivity.this, Radio.class);
                startActivity(radioIntent);
            }
        });

        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, Settings.class);
                startActivity(settingsIntent);
            }
        });
    }
}