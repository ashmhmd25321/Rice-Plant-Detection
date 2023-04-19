package com.example.ricediseasedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button imageClassify, realtimeDetect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imageClassify = findViewById(R.id.button);
        realtimeDetect = findViewById(R.id.button3);

        imageClassify.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        realtimeDetect.setOnClickListener(view -> {
            Intent i = getPackageManager().getLaunchIntentForPackage("com.example.realtime_riceplant_detection");
            startActivity(i);
        });
    }
}