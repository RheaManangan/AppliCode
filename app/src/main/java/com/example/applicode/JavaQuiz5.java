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



public class JavaQuiz5 extends AppCompatActivity {

    TextView textnum5;
    JustifiedTextView justifiedTextViewfive;
    String javaquiz5;

    TextView textnumjava5;
    JustifiedTextView justifiedjava5;
    String code5;

    EditText answerjava5;
    Button donejava5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javaquiz5);


        textnum5 = findViewById(R.id.textnum5);
        justifiedTextViewfive = findViewById(R.id.justified_text_viewfive);
        javaquiz5 = getString(R.string.javaquiz5);
        textnum5.setText(javaquiz5);


        textnumjava5= findViewById(R.id.textnumjava5);
        justifiedjava5 = findViewById(R.id.justifiedjava5);
        code5 = getString(R.string.code5);
        textnumjava5.setText(code5);


        answerjava5 = findViewById(R.id.answerjava5);
        donejava5 = findViewById(R.id.donejava5);

        donejava5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerjava5.getText().toString().equals("scanner")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerjava5 + "data", "Well Done ! You Got the  Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();


                    Intent intent = new Intent(JavaQuiz5.this, DisplayClassJ5.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });




    }


}


