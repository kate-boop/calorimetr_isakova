package com.example.myapplication;




import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener
{
    SensorManager sensorManager;
    TextView tv_Steps;
    float calorii=0f;

    boolean isRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        tv_Steps = (TextView) findViewById(R.id.textView_Steps);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        isRunning = true;
        Sensor countSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if (countSensor != null)
        {
            sensorManager.registerListener(this, countSensor, SensorManager.SENSOR_DELAY_UI);
        }
        else
        {
            Toast.makeText(this, "На вашем устройствей шагомер не работает", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        isRunning = false;
//    sensorManager.unregisterListener(this); // this will stop detecting steps!
    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        if (isRunning)
        {
            tv_Steps.setText(String.valueOf(event.values[0]));
            calorii=event.values[0];
        }
    }
    public void onClick_goNext(View v){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("calorii", Float.toString(calorii));
        startActivity(intent);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {
        // Needed this method to skip the error
        // error: MainActivity is not abstract and does not override abstract method onAccuracyChanged(Sensor,int) in SensorEventListener
        // public class MainActivity extends AppCompatActivity implements SensorEventListener
    }
}