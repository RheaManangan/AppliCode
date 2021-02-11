package com.example.applicode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DisplayClassJs1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayjs1);

        TextView info=(TextView)findViewById(R.id.textjs1);
        Button nextjs1=(Button) findViewById(R.id.nextjs1);

        SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);
        String display=preferences.getString("display","");

        info.setText(display);




        nextjs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayClassJs1.this, JsQuiz2.class);
                startActivity(intent);
            }

        });



    }

}

