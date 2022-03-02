package com.example.earthquake_reporter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class listAdapter extends ArrayAdapter<quake> {

    public listAdapter(@NonNull Context context, ArrayList<quake> quakeArrayList) {
        super(context, R.layout.activity_earthquake, quakeArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        quake earthquake = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_earthquake, parent, false);
        }

        TextView magText = convertView.findViewById(R.id.mag);
        TextView dateText = convertView.findViewById(R.id.date);
        TextView cityText = convertView.findViewById(R.id.city);
        TextView timeText = convertView.findViewById(R.id.time);
        TextView locationText = convertView.findViewById(R.id.location);

        magText.setText(earthquake.getmag());
        dateText.setText(earthquake.getdate());
        timeText.setText(earthquake.getTime());
        cityText.setText(earthquake.getcity());
        locationText.setText(earthquake.getlocation());

        return convertView;
    }
}
