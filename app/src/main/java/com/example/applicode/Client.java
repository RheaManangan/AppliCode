package com.example.applicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Client extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client);

        Button back2c = findViewById(R.id.back2c);
        Button next2c = findViewById(R.id.next2c);
        Button btnhtml = findViewById(R.id.btnhtml);
        Button btnjscript = findViewById(R.id.btnjscript);

        back2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Client.this, DefClient.class);
                startActivity(intent);
            }

        });
        next2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Client.this, JScript.class);
                startActivity(intent);
            }

        });
        btnjscript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Client.this, JScript.class);
                startActivity(intent);
            }

        });
        btnhtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Client.this, html.class);
                startActivity(intent);
            }

        });

    }}
