package com.example.rana_jabareen.guessgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;
public class GuessActivity extends AppCompatActivity {
    private int Rnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guess);
        Random r= new Random();
        Rnumber=r.nextInt(1000);

        Button btw1=(Button)findViewById(R.id.button);
        btw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt = (EditText) findViewById(R.id.editText);
                int enteredNumber = Integer.parseInt(txt.getText().toString());
                if (enteredNumber == Rnumber)
                    Toast.makeText(GuessActivity.this, "Congratulation!You Guessed", Toast.LENGTH_SHORT).show();
                else if (((Math.abs(enteredNumber - Rnumber))> 0) &&((Math.abs(enteredNumber - Rnumber))<= 5) )
                    Toast.makeText(GuessActivity.this, "Very Close ", Toast.LENGTH_SHORT).show();
                else if (enteredNumber < Rnumber)
                    Toast.makeText(GuessActivity.this, "Enter Greater Number", Toast.LENGTH_SHORT).show();
                else if (enteredNumber > Rnumber)
                    Toast.makeText(GuessActivity.this, "Enter Smaller Number", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
