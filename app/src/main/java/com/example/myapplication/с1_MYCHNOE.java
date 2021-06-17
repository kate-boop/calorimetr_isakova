package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class с1_MYCHNOE extends AppCompatActivity {
    int calorii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_mychnoe);
        Bundle arguments = getIntent().getExtras();

        String name = arguments.get("calorii").toString();
        calorii = (int)Float.parseFloat(name);

       TextView tv=(TextView)findViewById(R.id.textView_c1);
        tv.setText(Integer.toString(calorii));
    }
    public void onClick (View view) {
    Intent intent = new Intent(с1_MYCHNOE.this, MainActivity.class);
    startActivity(intent);
}

}