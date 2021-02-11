package com.example.applicode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class DisplayClassHtml2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayhtml2);

        TextView info=(TextView)findViewById(R.id.displayh2);
        Button nexth2=(Button) findViewById(R.id.nexth2);

        SharedPreferences preferences=getSharedPreferences("MyPREFS", MODE_PRIVATE);
        String display=preferences.getString("display","");

        info.setText(display);




        nexth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayClassHtml2.this, HtmlQuiz3.class);
                startActivity(intent);
            }

        });



    }

}

