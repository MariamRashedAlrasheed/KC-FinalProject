package com.example.myapplicationfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main_details_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_details);
        Bundle bundle = getIntent().getExtras();
        Counsel dlieverCounsel = (Counsel) bundle.getSerializable("Counsel");

        TextView CounselNameTextView = findViewById(R.id.counselName);
        TextView treatTextView = findViewById(R.id.treat);
        ImageView CounselImage = findViewById(R.id.counselImage);

        CounselNameTextView.setText(dlieverCounsel.getCounselName());
        CounselNameTextView.setText(dlieverCounsel.getTreat());
        CounselImage.setImageResource(dlieverCounsel.getCounselImage());
    }
}