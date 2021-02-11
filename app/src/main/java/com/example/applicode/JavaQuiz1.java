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



public class JavaQuiz1 extends AppCompatActivity {

    TextView textnum1;
    JustifiedTextView justifiedTextViewone;
    String javaquiz1;
    TextView textnum2;
    JustifiedTextView justifiedTextViewone2;
    String hello;

    EditText answerjava1;
    Button donejava1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javaquiz1);


        textnum1 = findViewById(R.id.textnum1);
        justifiedTextViewone = findViewById(R.id.justified_text_viewone);
        javaquiz1 = getString(R.string.javaquiz1);
        textnum1.setText(javaquiz1);
        textnum2 = findViewById(R.id.textnum2);
        justifiedTextViewone2 = findViewById(R.id.justified_text_viewone2);
        hello = getString(R.string.hello);
        textnum2.setText(hello);


        answerjava1 = findViewById(R.id.answerjava1);
        donejava1 = findViewById(R.id.donejava1);

        donejava1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerjava1.getText().toString().equals("print")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerjava1 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();


                    Intent intent = new Intent(JavaQuiz1.this, DisplayClass.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });










    }


    }


