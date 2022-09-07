package com.example.myapplicationfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView Titel = findViewById(R.id.textView);
        Button roundButton = findViewById(R.id.button);
        Button roundButton2 = findViewById(R.id.button2);
        TextView counselor = findViewById(R.id.textView2);
        TextView client = findViewById(R.id.textView3);
        Button continuee = findViewById(R.id.button3);


    }
}