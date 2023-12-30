package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KiloToGR extends AppCompatActivity {
    EditText input;
    Button btn;
    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilo_to_gr);
        input = findViewById(R.id.conversion);
        btn = findViewById(R.id.btn);
        output = findViewById(R.id.output);
        String str = input.getText().toString();
        double kilo = Double.parseDouble(str);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double setvl = converter(kilo);
                output.setText("" + setvl);
            }
        });

    }
    public double converter( double kilo){
        return kilo*1000;

    }
}