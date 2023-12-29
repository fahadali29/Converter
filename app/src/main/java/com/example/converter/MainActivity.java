package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button weight , temp , length , speed , time , area;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.materialButton);
        temp = findViewById(R.id.temp);
        length = findViewById(R.id.length);
        speed = findViewById(R.id.speed);
        time = findViewById(R.id.time);
        area = findViewById(R.id.area);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                 intent = new Intent(MainActivity.this , Weight.class);
                 startActivity(intent);
            }
        });
        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this , Temp.class);
                startActivity(intent);
            }
        });
        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this , Length.class);
                startActivity(intent);
            }
        });
        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this , Speed.class);
                startActivity(intent);
            }
        });
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this , Time.class);
                startActivity(intent);
            }
        });
        area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this , Area.class);
                startActivity(intent);
            }
        });

    }
}