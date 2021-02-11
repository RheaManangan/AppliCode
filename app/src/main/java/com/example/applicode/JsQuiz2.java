package com.example.applicode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import com.codesgood.views.JustifiedTextView;



public class JsQuiz2 extends AppCompatActivity {

    EditText answerjs2;
    Button donejs2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jsquiz2);


        answerjs2 = findViewById(R.id.answerjs2);
        donejs2 = findViewById(R.id.donejs2);

        donejs2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerjs2.getText().toString().equals("script")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerjs2 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();

                    Intent intent = new Intent(JsQuiz2.this, DisplayClassJs2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }


}


