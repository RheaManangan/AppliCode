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



public class JavaQuiz2 extends AppCompatActivity {

    TextView textnum2;
    JustifiedTextView justifiedTextViewtwo;
    String javaquiz2;

    TextView textnumjava2;
    JustifiedTextView justifiedjava2;
    String code2;

    EditText answer2;
    Button donejava2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javaquiz2);


        textnum2 = findViewById(R.id.textnum2);
        justifiedTextViewtwo = findViewById(R.id.justified_text_viewtwo);
        javaquiz2 = getString(R.string.javaquiz2);
        textnum2.setText(javaquiz2);


        textnumjava2 = findViewById(R.id.textnumjava2);
        justifiedjava2 = findViewById(R.id.justifiedjava2);
        code2 = getString(R.string.code2);
        textnumjava2.setText(code2);



        answer2 = findViewById(R.id.answer2);
        donejava2 = findViewById(R.id.donejava2);

        donejava2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText().toString().equals("[]")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answer2 + "data", "Well Done ! You Got the  Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();


                    Intent intent = new Intent(JavaQuiz2.this, DisplayClassJ2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });











    }


}


