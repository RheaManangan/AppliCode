package com.example.applicode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DisplayClassJs5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayjs5);

        TextView info=(TextView)findViewById(R.id.displayjs5);
        Button nextjs5=(Button) findViewById(R.id.nextjs5);

        SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);
        String display=preferences.getString("display","");

        info.setText(display);




        nextjs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayClassJs5.this, ScoreJs.class);
                startActivity(intent);
            }

        });



    }

}

