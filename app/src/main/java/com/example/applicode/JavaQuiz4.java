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



public class JavaQuiz4 extends AppCompatActivity {

    TextView textnum4;
    JustifiedTextView justifiedTextViewfour;
    String javaquiz4;

    TextView textnumjava4;
    JustifiedTextView justifiedjava4;
    String code4;

    EditText answerjava4;
    Button donejava4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javaquiz4);


        textnum4 = findViewById(R.id.textnum4);
        justifiedTextViewfour = findViewById(R.id.justified_text_viewfour);
        javaquiz4 = getString(R.string.javaquiz4);
        textnum4.setText(javaquiz4);


        textnumjava4 = findViewById(R.id.textnumjava4);
        justifiedjava4 = findViewById(R.id.justifiedjava4);
        code4 = getString(R.string.code4);
        textnumjava4.setText(code4);


        answerjava4 = findViewById(R.id.answerjava4);
        donejava4 = findViewById(R.id.donejava4);

        donejava4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerjava4.getText().toString().equals("for")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerjava4 + "data", "Well Done ! You Got the  Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();


                    Intent intent = new Intent(JavaQuiz4.this, DisplayClassJ4.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });






    }


}


