package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class c3_moloko extends AppCompatActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_moloko);
        Bundle arguments = getIntent().getExtras();
        s = arguments.get("calorii").toString();
        //конторльный вывод
        TextView tv=(TextView)findViewById(R.id.textView3);
        tv.setText(s);
    }
}