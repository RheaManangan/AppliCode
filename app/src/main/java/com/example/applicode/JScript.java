package com.example.applicode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JScript extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javascript);

        Button Jintro= findViewById(R.id.Jintro);
        Button J2= findViewById(R.id.J2);
        Button J3= findViewById(R.id.J3);
        Button J4 = findViewById(R.id.J4);
        Button J5 = findViewById(R.id.J5);
        Button J6 = findViewById(R.id.J6);
        Button J7 = findViewById(R.id.J7);
        Button J8 = findViewById(R.id.J8);
        Button Ex3 = findViewById(R.id.Ex3);
        Button jsquiz = findViewById(R.id.jsquiz);


        Jintro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum1Class.class);
                startActivity(intent);
            }

        });
        J2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum2Class.class);
                startActivity(intent);
            }

        });
        J3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum3Class.class);
                startActivity(intent);
            }

        });
        J4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum4Class.class);
                startActivity(intent);
            }

        });
        J5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum5Class.class);
                startActivity(intent);
            }

        });
        J6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum6Class.class);
                startActivity(intent);
            }

        });
        J7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum7Class.class);
                startActivity(intent);
            }

        });
        J8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JSNum8Class.class);
                startActivity(intent);
            }

        });
        Ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JavaSEx.class);
                startActivity(intent);
            }

        });
        jsquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JScript.this, JsQuiz1.class);
                startActivity(intent);
            }

        });

    }

}
