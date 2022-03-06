package com.example.earthquake_reporter;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LogTag = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<quake> earthquakes = QueryUtils.extractEarthquakes();


        ListView quakeList = findViewById(R.id.list);
        listAdapter listAdapter = new listAdapter(MainActivity.this, earthquakes);
        quakeList.setAdapter(listAdapter);

    }
}