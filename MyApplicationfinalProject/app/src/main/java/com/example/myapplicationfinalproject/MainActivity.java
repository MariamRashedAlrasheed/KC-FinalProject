package com.example.myapplicationfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Titel = findViewById(R.id.Titel);
        EditText EmailEdt = findViewById(R.id.emailEditText);
        EditText PasswordEdt = findViewById(R.id.PasswordEditText);
        Button LogIn = findViewById(R.id.LogInButton);
        Button CreatAcc = findViewById(R.id.CreatButton);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bus = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(bus);
            }
        });
        CreatAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent buss = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(buss);
            }
        });

    }
}