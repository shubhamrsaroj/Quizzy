package com.example.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class Quiz3Sci extends AppCompatActivity {
    Button o1, o2, o3, o4;
    TextView tve;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3_sci);
        o1 = findViewById(R.id.button11);
        o2 = findViewById(R.id.button12);
        o3 = findViewById(R.id.button13);
        o4 = findViewById(R.id.button14);
        tve = findViewById(R.id.THIRD);





        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startOneActivity("Graphite");
                ButtonS31.isPressed = !ButtonS31.isPressed;

            }
        });


        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTwoActivity("Silicon");
                ButtonS32.isPressed = !ButtonS32.isPressed;
            }
        });

        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startThreeActivity("Charcoal");
                ButtonS33.isPressed = !ButtonS33.isPressed;
            }
        });
        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFourActivity("Phosphorus");
                ButtonS34.isPressed = !ButtonS34.isPressed;
            }
        });
    }








    public void startTimerr(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to start the NextActivity
                Intent intent = new Intent(getApplicationContext(), Quiz4Sci.class);
                startActivity(intent);

                // Finish the CurrentActivity to destroy it
                finish();
            }
        }, 3000); // Delay in milliseconds (15 seconds)
    }





    private void startTwoActivity(String A2) {
        Toast.makeText(getApplicationContext(),"Right Ans:Graphite",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), Quiz4Sci.class);
        startTimerr();



    }

    private void startOneActivity(String A1) {


        Intent intent = new Intent(getApplicationContext(), Quiz4Sci.class);
        startActivity(intent);


    }






    private void startThreeActivity(String A3) {
        Toast.makeText(getApplicationContext(),"Right Ans:Graphite",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), Quiz4Sci.class);

        startTimerr();



    }




    private void startFourActivity(String A4) {
        Toast.makeText(getApplicationContext(),"Right Ans:Graphite",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(), Quiz4Sci.class);
              startTimerr();




    }}






