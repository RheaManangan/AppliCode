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



public class HtmlQuiz2 extends AppCompatActivity {

    EditText answerh2;
    Button doneh2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.htmlquiz2);


        answerh2 = findViewById(R.id.answerh2);
        doneh2 = findViewById(R.id.doneh2);

        doneh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerh2.getText().toString().equals("tags")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerh2 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();

                    Intent intent = new Intent(HtmlQuiz2.this, DisplayClassHtml2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }


}


