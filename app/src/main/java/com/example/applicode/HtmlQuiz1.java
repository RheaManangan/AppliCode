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



public class HtmlQuiz1 extends AppCompatActivity {

    EditText answerh1;
    Button doneh1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.htmlquiz1);


        answerh1 = findViewById(R.id.answerh1);
        doneh1 = findViewById(R.id.doneh1);

        doneh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerh1.getText().toString().equals("HTML")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerh1 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();

                    Intent intent = new Intent(HtmlQuiz1.this, DisplayClassHtml1.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }


}


