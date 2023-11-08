package com.example.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
ImageButton gk,history,science;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gk=findViewById(R.id.gk);
        history=findViewById(R.id.history);
        science=findViewById(R.id.science);

        gk.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),ActivityGeneral2.class);
            startActivity(intent);

        });

        history.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),history.class);
            startActivity(intent);

        });

        science.setOnClickListener(view -> {
            Intent intent=new Intent(getApplicationContext(),science.class);
            startActivity(intent);
        });




    }
}