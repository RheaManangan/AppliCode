package com.example.applicode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DisplayClassJs2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayjs2);

        TextView info=(TextView)findViewById(R.id.displayjs2);
        Button nextjs2=(Button) findViewById(R.id.nextjs2);

        SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);
        String display=preferences.getString("display","");

        info.setText(display);




        nextjs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayClassJs2.this, JsQuiz3.class);
                startActivity(intent);
            }

        });



    }

}

