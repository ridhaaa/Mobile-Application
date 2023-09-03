package com.example.alzher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
EditText e1;
Button b1;
SharedPreferences sh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.editTextTextPersonName);
        b1=findViewById(R.id.button);

        sh= PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        e1.setText(sh.getString("ip",""));
        b1.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        String ipaddress=e1.getText().toString();
//        Toast.makeText(this, ipaddress+",", Toast.LENGTH_SHORT).show();
        String url1 = "http://" + ipaddress + ":4000/";
        SharedPreferences.Editor ed=sh.edit();
        ed.putString("ip",ipaddress);
        ed.putString("url",url1);
        ed.commit();
        Intent i=new Intent(getApplicationContext(),Login.class);
        startActivity(i);
    }

}
