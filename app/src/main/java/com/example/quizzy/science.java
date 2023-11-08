package com.example.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class science extends AppCompatActivity {
    Button one, two, three, four;
    TextView tv;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        one = findViewById(R.id.button2);
        two = findViewById(R.id.button3);
        three = findViewById(R.id.button4);
        four = findViewById(R.id.button5);
        tv = findViewById(R.id.textView);





        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFirstActivity("Oxygen");
                ButtonStatus.isPressed = !ButtonStatus.isPressed;


            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startSecondActivity("Hydrogen Sulphide");
                TwoButtonStatus.isPressed = !TwoButtonStatus.isPressed;


            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startThirdActivity("Carbon Dioxide");
                ThreeButtonStatus.isPressed = !ThreeButtonStatus.isPressed;

            }

        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFourthActivity("Nitrogen");
                FourButtonStatus.isPressed = !FourButtonStatus.isPressed;

            }
        });

    }





    private void startFirstActivity(String a2) {

        Intent intent = new Intent(getApplicationContext(), Quiz3Sci.class);
        Handler handler = new Handler();
        long dellaymisllis = 3000;

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, dellaymisllis);

        Toast.makeText(getApplicationContext(), "Right Answer:Hydrogen Sulphide", Toast.LENGTH_SHORT).show();

    }

    private void startSecondActivity(String a3) {
        Intent intent = new Intent(getApplicationContext(), Quiz3Sci.class);
        startActivity(intent);

    }

    private void startThirdActivity(String a4) {
        Intent intent = new Intent(getApplicationContext(), Quiz3Sci.class);

        handler();
        Toast.makeText(getApplicationContext(), "Right Answer:Hydrogen Sulphide", Toast.LENGTH_SHORT).show();

    }

    private void startFourthActivity(String a5) {
        Intent intent = new Intent(getApplicationContext(), Quiz3Sci.class);
        Toast.makeText(getApplicationContext(), "Right Answer:Hydrogen Sulphide", Toast.LENGTH_SHORT).show();
        handler();
    }

    public void handler() {
        Intent intent = new Intent(getApplicationContext(), Quiz3Sci.class);
        Handler handler = new Handler();
        long dellaymisllis = 3000;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, dellaymisllis);


    }


}












