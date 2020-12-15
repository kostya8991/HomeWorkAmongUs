package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main_2_0);
    }

    public void killSomebody(View view){
        ImageView image_view = (ImageView)findViewById(R.id.status_img);
        TextView alive_tv = (TextView)findViewById(R.id.status_tv);
        alive_tv.setText(R.string.die_tv);
        image_view.setImageResource(R.drawable.dead_body);
        Toast toast = Toast.makeText(getApplicationContext(), "Nice work!", Toast.LENGTH_LONG);
        toast.show();
    }

    public void revive(View view){
        ImageView imageView = (ImageView)findViewById(R.id.status_img);
        TextView textView = (TextView)findViewById(R.id.status_tv);
        textView.setText(R.string.alive_tv);
        imageView.setImageResource(R.drawable.wonder_day_among_us_21);
        Toast toast = Toast.makeText(getApplicationContext(), "Imposter has risen)))", Toast.LENGTH_LONG);
        toast.show();
    }
}