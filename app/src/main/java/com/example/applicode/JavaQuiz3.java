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



public class JavaQuiz3 extends AppCompatActivity {

    TextView textnum3;
    JustifiedTextView justifiedTextViewthree;
    String javaquiz3;

    TextView textnumjava3;
    JustifiedTextView justifiedjava3;
    String code3;

    EditText answerjava3;
    Button donejava3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javaquiz3);


        textnum3 = findViewById(R.id.textnum3);
        justifiedTextViewthree = findViewById(R.id.justified_text_viewthree);
        javaquiz3 = getString(R.string.javaquiz3);
        textnum3.setText(javaquiz3);


        textnumjava3 = findViewById(R.id.textnumjava3);
        justifiedjava3 = findViewById(R.id.justifiedjava3);
        code3 = getString(R.string.code3);
        textnumjava3.setText(code3);



        answerjava3 = findViewById(R.id.answerjava3);
        donejava3 = findViewById(R.id.donejava3);

        donejava3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerjava3.getText().toString().equals("sum")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerjava3 + "data", "Well Done ! You Got the  Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();


                    Intent intent = new Intent(JavaQuiz3.this, DisplayClassJ3.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });









    }


}


