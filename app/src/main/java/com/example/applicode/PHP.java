package com.example.applicode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PHP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.php);

        Button Pintro= findViewById(R.id.Pintro);
        Button P3= findViewById(R.id.P3);
        Button P4 = findViewById(R.id.P4);
        Button P5 = findViewById(R.id.P5);
        Button P6 = findViewById(R.id.P6);
        Button P7 = findViewById(R.id.P7);
        Button P8 = findViewById(R.id.P8);
        Button P9 = findViewById(R.id.P9);
        Button Ex2 = findViewById(R.id.Ex2);
        Button phpquiz = findViewById(R.id.phpquiz);


        Pintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum1Class.class);
                startActivity(intent);
            }

        });
        P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum3Class.class);
                startActivity(intent);
            }

        });
        P4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum4Class.class);
                startActivity(intent);
            }

        });
        P5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum5Class.class);
                startActivity(intent);
            }

        });
        P6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum6Class.class);
                startActivity(intent);
            }

        });
        P7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum7Class.class);
                startActivity(intent);
            }

        });
        P8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum8Class.class);
                startActivity(intent);
            }

        });
        P9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PNum9Class.class);
                startActivity(intent);
            }

        });
        Ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PhpEx.class);
                startActivity(intent);
            }

        });
        phpquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PHP.this, PhpQuiz1.class);
                startActivity(intent);
            }

        });
    }

}
