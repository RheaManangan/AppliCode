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



public class PhpQuiz4 extends AppCompatActivity {

    TextView textnumphp4;
    JustifiedTextView justifiedTextViewphpfour;
    String phpquiz4;

    TextView textphp4;
    JustifiedTextView justifiedphp4;
    String phpcode4;

    EditText answerphp4;
    Button donephp4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phpquiz4);


        textnumphp4 = findViewById(R.id.textnumphp4);
        justifiedTextViewphpfour = findViewById(R.id.justified_text_viewphpfour);
        phpquiz4= getString(R.string.phpquiz4);
        textnumphp4.setText(phpquiz4);

        textphp4 = findViewById(R.id.textphp4);
        justifiedphp4 = findViewById(R.id.justifiedphp4);
        phpcode4= getString(R.string.phpcode4);
        textphp4.setText(phpcode4);


        answerphp4 = findViewById(R.id.answerphp4);
        donephp4= findViewById(R.id.donephp4);

        donephp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerphp4.getText().toString().equals("$factorial")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerphp4 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();

                    Intent intent = new Intent(PhpQuiz4.this, DisplayClassP4.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }


}


