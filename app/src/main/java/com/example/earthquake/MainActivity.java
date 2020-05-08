package com.example.earthquake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
        ArrayList<Quakes> earthquakes = new ArrayList();
        earthquakes.add(new Quakes("7.2","San Francisco","Feb2, 2016"));
        earthquakes.add(new Quakes("6.1","London", "July 20, 2015"));
        earthquakes.add(new Quakes("3.9","Tokyo", "Nov 10, 2014"));
        earthquakes.add( new Quakes("4.5","Mexico City", "May3, 2014"));
        earthquakes.add(new Quakes("2.8","Moscow","Jan 30, 2013"));
        earthquakes.add(new Quakes("4.9","Rio de Janeiro","Aug 19,2012"));
        earthquakes.add(new Quakes("1.6","Paris", "Oct 30, 2011"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        QuakeArrayAdapter adapter = new QuakeArrayAdapter(MainActivity.this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
