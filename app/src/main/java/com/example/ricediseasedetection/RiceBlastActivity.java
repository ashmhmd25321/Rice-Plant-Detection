package com.example.ricediseasedetection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class RiceBlastActivity extends AppCompatActivity {

    Button download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice_blast);

        download = findViewById(R.id.button5);

        download.setOnClickListener(view -> {
            Toast.makeText(this,"Downloaded", Toast.LENGTH_SHORT).show();
        });
    }
}