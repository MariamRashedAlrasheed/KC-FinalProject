package com.example.myapplicationfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {
    ArrayList<Counsel> counselArrayList = new ArrayList<>();
    int currentCounsel = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView counselImage = findViewById(R.id.counselImage);
        TextView counselName = findViewById(R.id.counselName);
        TextView counselTreat = findViewById(R.id.treat);



        Counsel counsel1 = new Counsel("Counselor: Buthaina Issa","Treat anxiety, depression, stress, suicidal thoughts",R.drawable.imggg);
        Counsel counsel2 = new Counsel("Counselor: Osman Mubarak", "Treat breakups, negative relationships, post-traumatic stress disorder",R.drawable.img);
        Counsel counsel3 = new Counsel("Counselor: Faisal Khaled", "Treat: sadness and grief, relationship difficulties, bipolar disorder", R.drawable.img_1);
        Counsel counsel4 = new Counsel("Consultant: Mona Kazemi", "Treat: behavioral difficulties, learning disability, emotional disturbance, chronic illness", R.drawable.img_2);
        Counsel counsel5 = new Counsel("Consultant: Lian Salem", "Treat: family conflicts, obsessive-compulsive disorder, divorce",R.drawable.img_3);

        counselArrayList.add(counsel1);
        counselArrayList.add(counsel2);
        counselArrayList.add(counsel3);
        counselArrayList.add(counsel4);
        counselArrayList.add(counsel5);

        counselImage.setImageResource(counselArrayList.get(currentCounsel).getCounselImage());
        counselName.setText(counselArrayList.get(currentCounsel).getCounselName());
        counselTreat.setText(counselArrayList.get(currentCounsel).getTreat());

        CounselAdapter counselAdapter = new CounselAdapter(this, 0, counselArrayList);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(counselAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Counsel currentCounsel = counselArrayList.get(i);
                Intent intent = new Intent(MainActivity4.this,Main_details_Activity.class);
                intent.putExtra("Counsel", currentCounsel);
                startActivity(intent);
            }
        });

    }
}