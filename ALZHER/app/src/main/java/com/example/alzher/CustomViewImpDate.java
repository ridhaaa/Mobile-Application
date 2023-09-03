package com.example.alzher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class CustomViewImpDate extends BaseAdapter {
    String[] date,description;
    private Context context;
    Button b1;

    public CustomViewImpDate(Context applicationContext,String[] date, String[] description) {
        this.context = applicationContext;
        this.date= date;
        this.description = description;

    }

    @Override
    public int getCount() {
        return date.length;
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
            gridView=inflator.inflate(R.layout.activity_custom_view_imp_date,null);//same class name

        }
        else
        {
            gridView=(View)view;

        }
        TextView tv1=(TextView)gridView.findViewById(R.id.textView17);
        TextView tv2=(TextView)gridView.findViewById(R.id.textView20);

        tv1.setTextColor(Color.RED);//color setting
        tv2.setTextColor(Color.BLACK);


        tv1.setText(date[i]);
        tv2.setText(description[i]);

        return gridView;

    }

}
