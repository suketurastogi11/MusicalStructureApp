package com.example.suketurastogi.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recent);

        Button homeButton = (Button) findViewById(R.id.home_activity_button);
        Button myMusicButton = (Button) findViewById(R.id.my_music_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(RecentActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        myMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myMusicIntent = new Intent(RecentActivity.this, MyMusic.class);
                startActivity(myMusicIntent);
            }
        });
    }
}
