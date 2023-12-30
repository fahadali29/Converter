package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Weight extends AppCompatActivity {
    Button kilo , gram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        kilo = findViewById(R.id.ktog);
        gram = findViewById(R.id.gtok);
        kilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Weight.this , KiloToGR.class);
                startActivity(intent);
            }
        });
        gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Weight.this , GRToKilo.class);
                startActivity(intent);
            }
        });
    }
}