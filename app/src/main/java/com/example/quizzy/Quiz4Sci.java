package com.example.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz4Sci extends AppCompatActivity {

    Button o1, o2, o3, o4;
    TextView tvF;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4_sci);
        o1 = findViewById(R.id.button15);
        o2 = findViewById(R.id.button16);
        o3 = findViewById(R.id.button17);
        o4 = findViewById(R.id.button18);
        tvF = findViewById(R.id.FIFTH);





        o1.setOnClickListener(view -> {

            startOneActivity();
            Button41.isPressed = !Button41.isPressed;

        });
        o2.setOnClickListener(view -> {

            startTwoActivity();
            Button42.isPressed = !Button42.isPressed;


        });

        o3.setOnClickListener(view -> {


            startThreeeActivity();
            Button43.isPressed = !Button43.isPressed;
        });
        o4.setOnClickListener(view -> {
            startFourActivity();
            Button44.isPressed = !Button44.isPressed;

        });


    }


    public void startTimerr(){
        Handler handler = new Handler();

        handler.postDelayed(() -> {
            // Create an Intent to start the NextActivity
            Intent intent = new Intent(getApplicationContext(), Quiz5Sci.class);
            startActivity(intent);

            // Finish the CurrentActivity to destroy it
            finish();
        }, 3000); // Delay in milliseconds (15 seconds)
    }


    private void startThreeeActivity() {
        Toast.makeText(getApplicationContext(),"Right Ans:Mercury",Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(getApplicationContext(),Quiz5Sci.class);
        startTimerr();


    }




    private void startTwoActivity() {
        Intent intent = new Intent(getApplicationContext(), Quiz5Sci.class);
        startActivity(intent);

    }






    private void startOneActivity(){
        Toast.makeText(getApplicationContext(),"Right Ans:Mercury",Toast.LENGTH_SHORT).show();

          Intent intent =new Intent(getApplicationContext(),Quiz5Sci.class);
         startTimerr();


    }

    private void startFourActivity(){
        Toast.makeText(getApplicationContext(),"Right Ans:Mercury",Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(getApplicationContext(),Quiz5Sci.class);
        startTimerr();


    }





}
