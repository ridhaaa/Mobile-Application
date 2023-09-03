package com.example.alzher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomViewImpNotes extends BaseAdapter {
    String[]note,date;
    private Context context;


    public CustomViewImpNotes(Context applicationContext, String[] note, String[] date) {
        this.context = applicationContext;
        this.note= note;
        this.date = date;

    }


    @Override
    public int getCount() {
        return note.length;
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
            gridView=inflator.inflate(R.layout.activity_custom_view_imp_notes,null);//same class name

        }
        else
        {
            gridView=(View)view;

        }
        TextView tv1=(TextView)gridView.findViewById(R.id.textView23);
        TextView tv2=(TextView)gridView.findViewById(R.id.textView24);

        tv1.setTextColor(Color.RED);//color setting
        tv2.setTextColor(Color.BLACK);


        tv1.setText(note[i]);
        tv2.setText(date[i]);

        return gridView;

    }

}
