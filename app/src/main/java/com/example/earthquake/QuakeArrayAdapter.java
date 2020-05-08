package com.example.earthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class QuakeArrayAdapter extends ArrayAdapter<Quakes> {


    /**
     * constructor
     * @param context for the context
     * @param quakes array list of quakes
     * */
    public QuakeArrayAdapter(@NonNull Context context, ArrayList<Quakes> quakes) {
        super(context, 0, quakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.custom_view, parent, false);
        }
        //get the current item
        Quakes currentItem = getItem(position);

        //find all the views in the layout
        TextView magText = view.findViewById(R.id.mag_text);
        TextView placeText = view.findViewById(R.id.place_text);
        TextView dateText = view.findViewById(R.id.date_text);

        //set the texts to the views
        magText.setText(currentItem.getMagnitude());
        placeText.setText(currentItem.getPlace());
        dateText.setText(currentItem.getDate());




        return view;




    }
}
