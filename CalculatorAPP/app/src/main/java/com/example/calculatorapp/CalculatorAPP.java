package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalculatorAPP extends AppCompatActivity {
    Button btntmbh,btnkrg,btnkali,btnbagi;
    TextView kalkul,wording,hasil;
    EditText inputA,inputB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator_app);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //inisialisasi VIEW
        btntmbh=findViewById(R.id.tmbhbtn);
        btnkrg=findViewById(R.id.krgbtn);
        btnkali=findViewById(R.id.kalibtn);
        btnbagi=findViewById(R.id.bagibtn);
        inputA=findViewById(R.id.inputA);
        inputB=findViewById(R.id.inputB);
        kalkul=findViewById(R.id.kalkul);
        wording=findViewById(R.id.wording);
        hasil=findViewById(R.id.hasil);

        //set button tambah
        btntmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(inputA.getText().toString());
                int b = Integer.parseInt(inputB.getText().toString());
                int result = a + b;
                hasil.setText(String.valueOf(result));
            }
        });

        btnkrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(inputA.getText().toString());
                int b = Integer.parseInt(inputB.getText().toString());
                int result = a - b;
                hasil.setText(String.valueOf(result));
            }
        });

        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(inputA.getText().toString());
                int b = Integer.parseInt(inputB.getText().toString());
                int result = a * b;
                hasil.setText(String.valueOf(result));
            }
        });

        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(inputA.getText().toString());
                int b = Integer.parseInt(inputB.getText().toString());
                if (b != 0) {
                    int result = (int) a / b;
                    hasil.setText(String.valueOf(result));
                } else {
                    hasil.setText("Tidak bisa bagi 0");
                }
            }
        });




    }
}