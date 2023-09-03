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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class CustomViewPrediction extends BaseAdapter {
    String[] img,result;
    private Context context;


    public CustomViewPrediction(Context applicationContext,String[] img, String[] result) {
        this.context = applicationContext;
        this.img= img;
        this.result = result;

    }

    @Override
    public int getCount() {
        return result.length;
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
        LayoutInflater inflator=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;
        if(view==null)
        {
            gridView=new View(context);
            //gridView=inflator.inflate(R.layout.customview, null);
            gridView=inflator.inflate(R.layout.activity_custom_view_prediction,null);//same class name

        }
        else
        {
            gridView=(View)view;

        }
        ImageView imageView = (ImageView) gridView.findViewById(R.id.imageView2);
        TextView tv2=(TextView)gridView.findViewById(R.id.textView28);


        tv2.setTextColor(Color.BLACK);

        tv2.setText(result[i]);

        SharedPreferences sh = PreferenceManager.getDefaultSharedPreferences(context);
        String ip = sh.getString("ip", "");
        String url = "http://" + ip + ":4000" + img[i];
        Picasso.with(context).load(url).transform(new CircleTransform()).into(imageView);//circle


        return gridView;
    }
}