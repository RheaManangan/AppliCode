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



public class PhpQuiz2 extends AppCompatActivity {

    TextView textnumphp2;
    JustifiedTextView justifiedTextViewphptwo;
    String phpquiz2;

    EditText answerphp2;
    Button donephp2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phpquiz2);


        textnumphp2 = findViewById(R.id.textnumphp2);
        justifiedTextViewphptwo = findViewById(R.id.justified_text_viewphptwo);
        phpquiz2 = getString(R.string.phpquiz2);
        textnumphp2.setText(phpquiz2);



        answerphp2 = findViewById(R.id.answerphp2);
        donephp2 = findViewById(R.id.donephp2);

        donephp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerphp2.getText().toString().equals("echo")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerphp2 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();

                    Intent intent = new Intent(PhpQuiz2.this, DisplayClassP2.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });




    }


}


