package com.example.applicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Definition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definition);

        Button back1Button = findViewById(R.id.back1);
        Button next1Button = findViewById(R.id.next1);

        back1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Definition.this, CandSClass.class);
                startActivity(intent);
            }

        });
        next1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Definition.this, ServerSide.class);
                startActivity(intent);
            }

        });
    }

        }