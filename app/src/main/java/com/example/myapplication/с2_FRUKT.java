package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class с2_FRUKT extends AppCompatActivity {
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_frukt);
        //получение значений
        Bundle arguments = getIntent().getExtras();
        s = arguments.get("calorii").toString();
        //конторльный вывод
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(s);


    }

}