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



public class PhpQuiz1 extends AppCompatActivity {

    TextView textnumphp1;
    JustifiedTextView justifiedTextViewphpone;
    String phpquiz1;

    EditText answerphp1;
    Button donephp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phpquiz1);


        textnumphp1 = findViewById(R.id.textnumphp1);
        justifiedTextViewphpone = findViewById(R.id.justified_text_viewphpone);
        phpquiz1 = getString(R.string.phpquiz1);
        textnumphp1.setText(phpquiz1);



        answerphp1 = findViewById(R.id.answerphp1);
        donephp1 = findViewById(R.id.donephp1);

        donephp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answerphp1.getText().toString().equals("<?")) {

                    SharedPreferences preferences = getSharedPreferences("MyPREFS", MODE_PRIVATE);
                    String Detail = preferences.getString(answerphp1 + "data", "Well Done ! You Got the Correct Answer!");

                    SharedPreferences.Editor editor = preferences.edit();

                    editor.putString("display", Detail);
                    editor.commit();

                    Intent intent = new Intent(PhpQuiz1.this, DisplayClassP1.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Oooops!! Wrong Answer!!", Toast.LENGTH_SHORT).show();
                }


            }
        });





    }


}


