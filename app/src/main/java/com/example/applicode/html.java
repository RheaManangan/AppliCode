package com.example.applicode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class html extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.html);

        Button Hintro= findViewById(R.id.Hintro);
        Button H22= findViewById(R.id.H22);
        Button H3= findViewById(R.id.H3);
        Button H4 = findViewById(R.id.H4);
        Button H5 = findViewById(R.id.H5);
        Button H6 = findViewById(R.id.H6);
        Button H7 = findViewById(R.id.H7);
        Button H8 = findViewById(R.id.H8);
        Button Ex4 = findViewById(R.id.Ex4);


        Hintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum1Class.class);
                startActivity(intent);
            }

        });
        H22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum2Class.class);
                startActivity(intent);
            }

        });
        H3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum3Class.class);
                startActivity(intent);
            }

        });
        H4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum4Class.class);
                startActivity(intent);
            }

        });
        H5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum5Class.class);
                startActivity(intent);
            }

        });
        H6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum6Class.class);
                startActivity(intent);
            }

        });
        H7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum7Class.class);
                startActivity(intent);
            }

        });
        H8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HNum8Class.class);
                startActivity(intent);
            }

        });
        Ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(html.this, HtmlEx.class);
                startActivity(intent);
            }

        });

    }

}
