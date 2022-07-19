package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#3F51B5")));
        Button b1,b2,b3,b4,b5,b6;
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b1.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this,ToastActivity.class);
            startActivity(i);
        });
        b2.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Currently Unavailable", Toast.LENGTH_SHORT).show());
        b3.setOnClickListener(v -> {
            Intent k = new Intent(MainActivity.this,DayAndNight.class);
            startActivity(k);
        });
        b4.setOnClickListener(v -> {
                Intent l = new Intent(MainActivity.this,ClockActivity.class);
                startActivity(l);
        });
        b5.setOnClickListener(v -> {
            Intent m = new Intent(MainActivity.this,RegistrationActivity.class);
            startActivity(m);
        });
        b6.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Currently Unavailable", Toast.LENGTH_SHORT).show());

    }
}

