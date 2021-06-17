package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //получение значений
        Bundle arguments = getIntent().getExtras();
        s = arguments.get("calorii").toString();
        //конторльный вывод
        TextView tv=(TextView)findViewById(R.id.textView2);
        tv.setText(s);
    }

    public void onClick_1(View view) {
        Intent intent = new Intent(MainActivity2.this, с1_MYCHNOE.class);
        intent.putExtra("calorii", s);
        startActivity(intent);

/*        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("calorii", Float.toString(calorii));
        startActivity(intent);*/
    }
    public void onClick_2(View view) {
        Intent intent = new Intent(MainActivity2.this, с2_FRUKT.class);
        intent.putExtra("calorii", s);
        startActivity(intent);
    }

    public void onClick_3(View view) {
        Intent intent = new Intent(MainActivity2.this, c3_moloko.class);
        intent.putExtra("calorii", s);
        startActivity(intent);
    }

    public void onClick_4(View view) {
        Intent intent = new Intent(MainActivity2.this, с4_MYASO.class);
        startActivity(intent);
    }

    public void onClick_5(View view) {
        Intent intent = new Intent(MainActivity2.this, с5_OVOSCHI.class);
        startActivity(intent);
    }

    public void onClick_6(View view) {
        Intent intent = new Intent(MainActivity2.this, с6_FISH.class);
        startActivity(intent);
    }

}