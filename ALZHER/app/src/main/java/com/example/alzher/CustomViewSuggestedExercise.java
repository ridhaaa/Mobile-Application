package com.example.alzher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CustomViewSuggestedExercise extends BaseAdapter {
    String[]suggestion;
    private Context context;

    public CustomViewSuggestedExercise(Context applicationContext, String[] suggestion) {
        this.context = applicationContext;
        this.suggestion= suggestion;
    }


    @Override
    public int getCount() {
        return suggestion.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        if (view == null) {
            gridView = new View(context);
            //gridView=inflator.inflate(R.layout.customview, null);
            gridView = inflator.inflate(R.layout.activity_custom_view_suggested_exercise, null);//same class name

        } else {
            gridView = (View) view;

        }

        TextView tv1 = (TextView) gridView.findViewById(R.id.textView26);


        tv1.setTextColor(Color.RED);//color setting



        tv1.setText(suggestion[i]);


//
        return gridView;
    }
}