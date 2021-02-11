package com.example.applicode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DisplayClassJs3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayjs3);

        TextView info=(TextView)findViewById(R.id.displayjs3);
        Button nextjs3=(Button) findViewById(R.id.nextjs3);

        SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);
        String display=preferences.getString("display","");

        info.setText(display);




        nextjs3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayClassJs3.this, JsQuiz4.class);
                startActivity(intent);
            }

        });



    }

}

