package com.example.myapplicationfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView Name = findViewById(R.id.NameTextView);
        TextView Email = findViewById(R.id.EmailTextView);

        Bundle bundle = getIntent().getExtras();

        String Namee = bundle.getString("name");



    }
}