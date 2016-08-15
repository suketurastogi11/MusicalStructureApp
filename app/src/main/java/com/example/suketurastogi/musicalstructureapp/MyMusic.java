package com.example.suketurastogi.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        Button homeButton = (Button) findViewById(R.id.home_activity_button);
        Button recentActivityButton = (Button) findViewById(R.id.recent_activity_button);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MyMusic.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });

        recentActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentActivityIntent = new Intent(MyMusic.this, RecentActivity.class);
                startActivity(recentActivityIntent);
            }
        });
    }
}
