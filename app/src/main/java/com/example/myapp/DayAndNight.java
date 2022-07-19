package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DayAndNight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_and_night);
        getSupportActionBar().setTitle("Toast Activity");

//        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//Back button
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#3F51B5")));
        final RelativeLayout layout;
        Button day,night;
        TextView t;
        t=findViewById(R.id.tv1);
        day=findViewById(R.id.bt1);
        night=findViewById(R.id.bt2);
        layout=findViewById(R.id.layout);
        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundResource(R.color.white);
                t.setTextColor(Color.BLACK);
                day.setBackgroundColor(Color.DKGRAY);
                night.setBackgroundColor(Color.BLUE);
                Toast.makeText(DayAndNight.this, "Day Mode", Toast.LENGTH_SHORT).show();
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundResource(R.color.black);
                t.setTextColor(Color.WHITE);
                day.setBackgroundColor(Color.BLUE);
                night.setBackgroundColor(Color.DKGRAY);
                Toast.makeText(DayAndNight.this, "Night Mode", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}