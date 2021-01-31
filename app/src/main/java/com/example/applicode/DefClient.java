package com.example.applicode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DefClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definitionclient);

        Button back1C = findViewById(R.id.back1C);
        Button next1C = findViewById(R.id.next1C);

        back1C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DefClient.this, CandSClass.class);
                startActivity(intent);
            }

        });
        next1C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DefClient.this, Client.class);
                startActivity(intent);
            }

        });
    }

}