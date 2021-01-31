package com.example.applicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServerSide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.serverside);

        Button back2Button = findViewById(R.id.back2);
        Button next2Button = findViewById(R.id.next2);
        Button java = findViewById(R.id.java);
        Button php1 = findViewById(R.id.php1);

        back2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServerSide.this, Definition.class);
                startActivity(intent);
            }

        });
        next2Button.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                Intent intent = new Intent(ServerSide.this, Java.class);
                startActivity(intent);
            }

        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServerSide.this, Java.class);
                startActivity(intent);
            }

        });
        php1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ServerSide.this, PHP.class);
                startActivity(intent);
            }

        });

}}
