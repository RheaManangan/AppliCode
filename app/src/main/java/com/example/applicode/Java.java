package com.example.applicode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java);

        Button introButton = findViewById(R.id.intro);
        Button useButton = findViewById(R.id.use);
        Button jdkButton = findViewById(R.id.jdk);
        Button runButton = findViewById(R.id.run);
        Button identifiersButton = findViewById(R.id.identifiers);
        Button typesButton = findViewById(R.id.types);
        Button variablesButton = findViewById(R.id.variables);
        Button loopButton = findViewById(R.id.loop);
        Button decisionButton = findViewById(R.id.decision);
        Button ex1 = findViewById(R.id.ex1);


        introButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum1Class.class);
                startActivity(intent);
            }

        });
        useButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, Jnum2Class.class);
                startActivity(intent);
            }

        });
        jdkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum3Class.class);
                startActivity(intent);
            }

        });
        runButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum4Class.class);
                startActivity(intent);
            }

        });
        identifiersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum5Class.class);
                startActivity(intent);
            }

        });
        typesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum6Class.class);
                startActivity(intent);
            }

        });
        variablesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum7Class.class);
                startActivity(intent);
            }

        });
        loopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum8Class.class);
                startActivity(intent);
            }

        });
        decisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JNum9Class.class);
                startActivity(intent);
            }

        });
        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Java.this, JavaEx.class);
                startActivity(intent);
            }

        });
    }

}
