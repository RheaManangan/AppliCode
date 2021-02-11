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



public class PhpQuiz3 extends AppCompatActivity {

    TextView textnumphp3;
    JustifiedTextView justifiedTextViewphpthree;
    String phpquiz3;

    TextView textphp3;
    JustifiedTextView justifiedphp3;
    String phpcode3;

    EditText answerphp3;
    Button donephp3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phpquiz3);


        textnumphp3 = findViewById(R.id.textnumphp3);
        justifiedTextViewphpthree = findViewById(R.id.justified_text_viewphpthree);
        phpquiz3= getString(R.string.phpquiz3);
        textnumphp3.setText(phpquiz3);

        textphp3 = findViewById(R.id.textphp3);
        justifiedphp3 = findViewById(R.id.justifiedphp3);
        phpcode3= getString(R.string.phpcode3);
        textphp3.setText(phpcode3);


        answerphp3 = findViewById(R.id.answerphp3);
        donephp3 = findViewById(R.id.donephp3);

        donephp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerphp3.getText().toString().equals("while")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerphp3 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();

                    Intent intent = new Intent(PhpQuiz3.this, DisplayClassP3.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });




    }


}


