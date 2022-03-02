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



        ArrayList<quake> quakeArrayList = new ArrayList<>();
        quakeArrayList.add(new quake("10:15","1n.3w","kaj","2/2/2","4.5"));
        quakeArrayList.add(new quake("10:15","1n.3w","kaj","2/2/2","4.5"));
        quakeArrayList.add(new quake("10:15","1n.3w","kaj","2/2/2","4.5"));
        quakeArrayList.add(new quake("10:15","1n.3w","kaj","2/2/2","4.5"));



        ListView quakeList = findViewById(R.id.list);
        listAdapter listAdapter = new listAdapter(MainActivity.this, quakeArrayList);
        quakeList.setAdapter(listAdapter);

    }
}