package com.example.myapplicationfinalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CounselAdapter extends ArrayAdapter {
    List<Counsel> counselList;
    public CounselAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        counselList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_main4, parent, false);
        Counsel currentCounsel = counselList.get(position);
        return view;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.activity_main4, parent, false);

        Counsel currentCounsel = counselList.get(position);

        TextView CounselTextView = view.findViewById(R.id.counselName);
        TextView TreatTextView = view.findViewById(R.id.treat);
        ImageView ConselImage = view.findViewById(R.id.counselImage);

        CounselTextView.setText(currentCounsel.getCounselName());
        TreatTextView.setText(currentCounsel.getTreat());
        ConselImage.setImageResource(currentCounsel.getCounselImage());
        return view;
    }
}
