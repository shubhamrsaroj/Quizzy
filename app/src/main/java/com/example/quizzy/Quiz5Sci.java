package com.example.quizzy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz5Sci extends AppCompatActivity {

    Button o1, o2, o3, o4;
    TextView tvfF,scoree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz5_sci);
        o1 = findViewById(R.id.button19);
        o2= findViewById(R.id.button20);
        o3= findViewById(R.id.button21);
        o4 = findViewById(R.id.button22);
        tvfF = findViewById(R.id.SIXTH);
        scoree = findViewById(R.id.textr);

        o1.setOnClickListener(view -> {
            startOneActivity();

            Button51.isPressed = !Button51.isPressed;


        });
        o2.setOnClickListener(view -> {

            startTwoActivity();
            Button52.isPressed = !Button52.isPressed;


        });

        o3.setOnClickListener(view -> {


            startThreeActivity();
            Button53.isPressed = !Button53.isPressed;


        });
        o4.setOnClickListener(view -> {


            startFourActivity();
            Button54.isPressed = !Button54.isPressed;



        });


    }
 //q3
    public boolean checkvalue31() {

        // Use the value of isButtonPressed as needed
        return ButtonS31.isPressed;
    }
    public boolean checkvalue32() {

        // Use the value of isButtonPressed as needed
        return ButtonS32.isPressed;
    }
    public boolean checkvalue33() {

        // Use the value of isButtonPressed as needed
        return ButtonS33.isPressed;
    }
    public boolean checkvalue34() {

        // Use the value of isButtonPressed as needed
        return ButtonS34.isPressed;
    }
    //q3

    //q1
    public boolean checkScience1() {

        // Use the value of isButtonPressed as needed
        return ButtonStatus.isPressed;
    }
    public boolean checkScience2() {

        // Use the value of isButtonPressed as needed
        return TwoButtonStatus.isPressed;
    }
    public boolean checkScience3() {

        // Use the value of isButtonPressed as needed
        return ThreeButtonStatus.isPressed;
    }
    public boolean checkScience4() {

        // Use the value of isButtonPressed as needed
        return FourButtonStatus.isPressed;
    }
    //q1

    //q4
    public boolean valuecheck41() {

        // Use the value of isButtonPressed as needed
        return Button41.isPressed;
    }
    public boolean valuecheck42() {

        // Use the value of isButtonPressed as needed
        return Button42.isPressed;
    }
    public boolean valuecheck43() {

        // Use the value of isButtonPressed as needed
        return Button43.isPressed;
    }
    public boolean valuecheck44() {

        // Use the value of isButtonPressed as needed
        return Button44.isPressed;
    }
    public void startTimerr(){
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            // Create an Intent to start the NextActivity
            Intent intent=new Intent(getApplicationContext(),Quiz5Sci.class);
            startActivity(intent);

            // Finish the CurrentActivity to destroy it
            finish();
        }, 3000); // Delay in milliseconds (15 seconds)
    }

   
    //q4
    @SuppressLint("SetTextI18n")
    private void startOneActivity(){
        Toast.makeText(getApplicationContext(),"Right Answer:Bromine",Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(getApplicationContext(),Quiz5Sci.class);

        if((o1.isPressed())&((checkScience1()& checkvalue31()& valuecheck41()))){


            int count21=1;
            scoree.setText(count21+"/4");


        }
        //1

        else if((checkScience2()& checkvalue31()& valuecheck41())&(o1.isPressed())){

            int count22=2;
            scoree.setText(count22+"/4");


        }
       //2

        else if((checkScience3()& checkvalue31()& valuecheck41())&(o1.isPressed())){

            int count23=1;
            scoree.setText(count23+"/4");



        }
        //3
        else if((checkScience4()& checkvalue31()& valuecheck41())&(o1.isPressed())){
            int count24=1;
            scoree.setText(count24+"/4");

        }
        //4

        else if((checkScience1()& checkvalue32()& valuecheck41())&(o1.isPressed())){
            int count25=0;
            scoree.setText(
                    count25+"/4");

        }


        //5

        else if((checkScience2()& checkvalue32()& valuecheck41())&(o1.isPressed())){
            int count26=1;

            scoree.setText(count26+"/4");


        }

        //6
        else if((checkScience3()& checkvalue32()& valuecheck41())&(o1.isPressed())){
            int count27=0;
            scoree.setText(count27+"/4");

        }
          //7
        else if((checkScience4()& checkvalue32()& valuecheck41())&(o1.isPressed())){
            int count28=0;
            scoree.setText(count28+"/4");


        }
        else if((checkScience1()& checkvalue33()& valuecheck41())&(o1.isPressed())){
            int count29=0;
            scoree.setText(count29+"/4");


        }
  //8

        else if((checkScience2()& checkvalue33()& valuecheck41())&(o1.isPressed())){

            int count30=0;
            scoree.setText(count30+"/4");

        }
        //9
        else if((checkScience3()& checkvalue33()& valuecheck41())&(o1.isPressed())){
            int count31=0;
            scoree.setText(count31+"/4");

        }
        //10
        else if((checkScience4()& checkvalue33()& valuecheck41())&(o1.isPressed())){
            int count32=0;
            scoree.setText(count32+"/4");

        }
    //11
        else if((checkScience1()& checkvalue34()& valuecheck41())&(o1.isPressed())){
            int count33=0;
            scoree.setText(count33+"/4");

        }
//12
        else if((checkScience2()& checkvalue31()& valuecheck42())&(o1.isPressed())){
            int count34=3;
            scoree.setText(count34+"/4");

        }
          //13

        else if((checkScience1()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count35=2;
            scoree.setText(count35+"/4");

        }

           //14
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count36=2;
            scoree.setText(count36+"/4");

        }
             //15
        else if((checkScience4()& checkvalue31()& valuecheck42())&(o1.isPressed())){
            int count37=2;
            scoree.setText(count37+"/4");

        }

             //16




        else if((checkScience1()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count38=1;
            scoree.setText(count38+"/4");

        }
        //17
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count39=2;
            scoree.setText(count39+"/4");

        }



        //18

        else if((checkScience3()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count40=2;
            scoree.setText(count40+"/4");

        }
        //19
        else if((checkScience4()& checkvalue31()& valuecheck43())&(o1.isPressed())){
            int count41=1;
            scoree.setText(count41+"/4");

        }
        //20
        else if((checkScience1()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count42=1;
            scoree.setText(count42+"/4");

        }
        //21
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count43=2;
            scoree.setText(count43+"/4");

        }
        //22
        else if((checkScience4()& checkvalue31()& valuecheck44())&(o1.isPressed())){
            int count44=1;
            scoree.setText(count44+"/4");

        }
        //23
        else if((checkScience1()& checkvalue32()& valuecheck44())&(o1.isPressed())){
            int count45=0;
            scoree.setText(count45+"/4");

        }

        //24
        else if((checkScience2()& checkvalue32()& valuecheck44())&(o1.isPressed())){
            int count46=1;
            scoree.setText(count46+"/4");

        }
        //25
        else if((checkScience3()& checkvalue32()& valuecheck44())&(o1.isPressed())){
            int count47=2;
            scoree.setText(count47+"/4");

        }
        //26
        else if((checkScience4()& checkvalue32()& valuecheck44())&(o1.isPressed())){
            int count48=0;
            scoree.setText(count48+"/4");

        }
        //27
        else if((checkScience1()& checkvalue33()& valuecheck44())&(o1.isPressed())){
            int count49=0;
            scoree.setText(count49+"/4");

        }
        //28
        else if((checkScience1()& checkvalue34()& valuecheck44())&(o1.isPressed())){
            int count50=0;
            scoree.setText(count50+"/4");

        }
        //29

        else if((checkScience2()& checkvalue34()& valuecheck44())&(o1.isPressed())){
            int count51=1;
            scoree.setText(count51+"/4");

        }
        //30
        else if((checkScience3()& checkvalue34()& valuecheck44())&(o1.isPressed())){
            int count52=0;

            scoree.setText(count52+"/4");
        }
        else if((checkScience4()& checkvalue34()& valuecheck44())&(o1.isPressed())){
            int count53=0;
            scoree.setText(count53+"/4");

        }
        else{
            Toast.makeText(getApplicationContext(),"Score",Toast.LENGTH_SHORT).show();
        }

        startTimerr();


    }
    @SuppressLint("SetTextI18n")
    private void startTwoActivity(){
        Intent intent =new Intent(getApplicationContext(),Quiz5Sci.class);

        if((o2.isPressed())&((checkScience1()& checkvalue31()& valuecheck41()))){


            int count21=2;
            scoree.setText(count21+"/4");

        }
        //1

        else if((checkScience2()& checkvalue31()& valuecheck41())&(o2.isPressed())){

            int count22=3;
            scoree.setText(count22+"/4");



        }
        //2

        else if((checkScience3()& checkvalue31()& valuecheck41())&(o2.isPressed())){

            int count23=2;
            scoree.setText(count23+"/4");


        }
        //3
        else if((checkScience4()& checkvalue31()& valuecheck41())&(o2.isPressed())){
            int count24=2;
            scoree.setText(count24+"/4");

        }
        //4

        else if((checkScience1()& checkvalue32()& valuecheck41())&(o2.isPressed())){
            int count25=1;
            scoree.setText(count25+"/4");

        }


        //5

        else if((checkScience2()& checkvalue32()& valuecheck41())&(o2.isPressed())){
            int count26=2;
            scoree.setText(count26+"/4");

        }

        //6
        else if((checkScience3()& checkvalue32()& valuecheck41())&(o2.isPressed())){
            int count27=1;
            scoree.setText(count27+"/4");

        }
        //7
        else if((checkScience4()& checkvalue32()& valuecheck41())&(o2.isPressed())){
            int count28=1;
            scoree.setText(count28+"/4");

        }
        else if((checkScience1()& checkvalue33()& valuecheck41())&(o2.isPressed())){
            int count29=1;
            scoree.setText(count29+"/4");

        }
        //8

        else if((checkScience2()& checkvalue33()& valuecheck41())&(o2.isPressed())){
            int count30=3;
            scoree.setText(count30+"/4");

        }
        //9
        else if((checkScience3()& checkvalue33()& valuecheck41())&(o2.isPressed())){
            int count31=1;
            scoree.setText(count31+"/4");

        }
        //10
        else if((checkScience4()& checkvalue33()& valuecheck41())&(o2.isPressed())){
            int count32=1;
            scoree.setText(count32+"/4");

        }
        //11
        else if((checkScience1()& checkvalue34()& valuecheck41())&(o2.isPressed())){
            int count33=1;
            scoree.setText(count33+"/4");

        }
//12
        else if((checkScience2()& checkvalue31()& valuecheck42())&(o2.isPressed())){
            int count34=4;
            scoree.setText(count34+"/4");

        }
        //13

        else if((checkScience1()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count35=3;
            scoree.setText(count35+"/4");

        }

        //14
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count36=3;
            scoree.setText(count36+"/4");

        }
        //15
        else if((checkScience4()& checkvalue31()& valuecheck42())&(o2.isPressed())){
            int count37=3;
            scoree.setText(count37+"/4");

        }

        //16




        else if((checkScience1()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count38=3;
            scoree.setText(count38+"/4");

        }
        //17
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count39=3;
            scoree.setText(count39+"/4");

        }



        //18

        else if((checkScience3()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count40=3;
            scoree.setText(count40+"/4");

        }
        //19
        else if((checkScience4()& checkvalue31()& valuecheck43())&(o2.isPressed())){
            int count41=2;
            scoree.setText(count41+"/4");

        }
        //20
        else if((checkScience1()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count42=3;
            scoree.setText(count42+"/4");

        }
        //21
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count43=3;
            scoree.setText(count43+"/4");

        }
        //22
        else if((checkScience4()& checkvalue31()& valuecheck44())&(o2.isPressed())){
            int count44=2;
            scoree.setText(count44+"/4");

        }
        //23
        else if((checkScience1()& checkvalue32()& valuecheck44())&(o2.isPressed())){
            int count45=1;
            scoree.setText(count45+"/4");

        }

        //24
        else if((checkScience2()& checkvalue32()& valuecheck44())&(o2.isPressed())){
            int count46=2;
            scoree.setText(count46+"/4");

        }
        //25
        else if((checkScience3()& checkvalue32()& valuecheck44())&(o2.isPressed())){
            int count47=3;
            scoree.setText(count47+"/4");


        }
        //26
        else if((checkScience4()& checkvalue32()& valuecheck44())&(o2.isPressed())){
            int count48=1;
            scoree.setText(count48+"/4");

        }
        //27
        else if((checkScience1()& checkvalue33()& valuecheck44())&(o2.isPressed())) {
            int count49 = 1;
            scoree.setText(count49 + "/4");
        }
        //28
        else if((checkScience1()& checkvalue34()& valuecheck44())&(o2.isPressed())){
            int count50=1;
            scoree.setText(count50+"/4");

        }
        //29

        else if((checkScience2()& checkvalue34()& valuecheck44())&(o2.isPressed())){
            int count51=2;
            scoree.setText(count51+"/4");

        }
        //30
        else if((checkScience3()& checkvalue34()& valuecheck44())&(o2.isPressed())){
            int count52=1;
            scoree.setText(count52+"/4");

        }
        else if((checkScience4()& checkvalue34()& valuecheck44())&(o2.isPressed())){
            int count53=1;
            scoree.setText(count53+"/4");

        }
        else{
            Toast.makeText(getApplicationContext(),"Score",Toast.LENGTH_SHORT).show();
        }

        startTimerr();

    }
    @SuppressLint("SetTextI18n")
    private void startThreeActivity(){
        Toast.makeText(getApplicationContext(),"Right Answer:Bromine",Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(getApplicationContext(),Quiz5Sci.class);

        if((o3.isPressed())&((checkScience1()& checkvalue31()& valuecheck41()))){


            int count21=1;
            scoree.setText(count21+"/4");

        }
        //1

        else if((checkScience2()& checkvalue31()& valuecheck41())&(o3.isPressed())){

            int count22=2;
            scoree.setText(count22+"/4");



        }
        //2

        else if((checkScience3()& checkvalue31()& valuecheck41())&(o3.isPressed())){

            int count23=1;
            scoree.setText(count23+"/4");



        }
        //3
        else if((checkScience4()& checkvalue31()& valuecheck41())&(o3.isPressed())){
            int count24=1;
            scoree.setText(count24+"/4");

        }
        //4

        else if((checkScience1()& checkvalue32()& valuecheck41())&(o3.isPressed())){
            int count25=0;
            scoree.setText(count25+"/4");

        }


        //5

        else if((checkScience2()& checkvalue32()& valuecheck41())&(o3.isPressed())){
            int count26=1;
            scoree.setText(count26+"/4");

        }

        //6
        else if((checkScience3()& checkvalue32()& valuecheck41())&(o3.isPressed())){
            int count27=0;
            scoree.setText(count27+"/4");

        }
        //7
        else if((checkScience4()& checkvalue32()& valuecheck41())&(o3.isPressed())){
            int count28=0;
            scoree.setText(count28+"/4");

        }
        else if((checkScience1()& checkvalue33()& valuecheck41())&(o3.isPressed())){
            int count29=0;
            scoree.setText(count29+"/4");

        }
        //8

        else if((checkScience2()& checkvalue33()& valuecheck41())&(o3.isPressed())){
            int count30=1;
            scoree.setText(count30+"/4");

        }
        //9
        else if((checkScience3()& checkvalue33()& valuecheck41())&(o3.isPressed())){
            int count31=0;
            scoree.setText(count31+"/4");

        }
        //10
        else if((checkScience4()& checkvalue33()& valuecheck41())&(o3.isPressed())){
            int count32=0;
            scoree.setText(count32+"/4");

        }
        //11
        else if((checkScience1()& checkvalue34()& valuecheck41())&(o3.isPressed())){
            int count33=0;
            scoree.setText(count33+"/4");

        }
//12
        else if((checkScience2()& checkvalue31()& valuecheck42())&(o3.isPressed())){
            int count34=3;
            scoree.setText(count34+"/4");

        }
        //13

        else if((checkScience1()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count35=2;
            scoree.setText(count35+"/4");

        }

        //14
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count36=2;
            scoree.setText(count36+"/4");

        }
        //15
        else if((checkScience4()& checkvalue31()& valuecheck42())&(o3.isPressed())){
            int count37=2;
            scoree.setText(count37+"/4");

        }

        //16




        else if((checkScience1()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count38=1;
            scoree.setText(count38+"/4");

        }
        //17
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count39=2;
            scoree.setText(count39+"/4");

        }



        //18

        else if((checkScience3()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count40=2;
            scoree.setText(count40+"/4");

        }
        //19
        else if((checkScience4()& checkvalue31()& valuecheck43())&(o3.isPressed())){
            int count41=1;
            scoree.setText(count41+"/4");

        }
        //20
        else if((checkScience1()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count42=1;
            scoree.setText(count42+"/4");

        }
        //21
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count43=2;
            scoree.setText(count43+"/4");

        }
        //22
        else if((checkScience4()& checkvalue31()& valuecheck44())&(o3.isPressed())){
            int count44=1;
            scoree.setText(count44+"/4");

        }
        //23
        else if((checkScience1()& checkvalue32()& valuecheck44())&(o3.isPressed())){
            int count45=0;
            scoree.setText(count45+"/4");

        }

        //24
        else if((checkScience2()& checkvalue32()& valuecheck44())&(o3.isPressed())){
            int count46=1;
            scoree.setText(count46+"/4");

        }
        //25
        else if((checkScience3()& checkvalue32()& valuecheck44())&(o3.isPressed())){
            int count47=2;
            scoree.setText(count47+"/4");

        }
        //26
        else if((checkScience4()& checkvalue32()& valuecheck44())&(o3.isPressed())){
            int count48=0;
            scoree.setText(count48+"/4");

        }
        //27
        else if((checkScience1()& checkvalue33()& valuecheck44())&(o3.isPressed())){
            int count49=0;
            scoree.setText(count49+"/4");

        }
        //28
        else if((checkScience1()& checkvalue34()& valuecheck44())&(o3.isPressed())){
            int count50=0;
            scoree.setText(count50+"/4");

        }
        //29

        else if((checkScience2()& checkvalue34()& valuecheck44())&(o3.isPressed())){
            int count51=1;
            scoree.setText(count51+"/4");

        }
        //30
        else if((checkScience3()& checkvalue34()& valuecheck44())&(o3.isPressed())){
            int count52=0;
            scoree.setText(count52+"/4");

        }
        else if((checkScience4()& checkvalue34()& valuecheck44())&(o3.isPressed())){
            int count53=0;
            scoree.setText(count53+"/4");

        }
        else{
            Toast.makeText(getApplicationContext(),"Score",Toast.LENGTH_SHORT).show();
        }

        startTimerr();

    }

    private void startFourActivity(){
        Toast.makeText(getApplicationContext(),"Right Answer:Bromine",Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(getApplicationContext(),Quiz5Sci.class);


        if((o4.isPressed())&((checkScience1()& checkvalue31()& valuecheck41()))){


            int count21=1;
            scoree.setText(count21+"/4");

        }
        //1

        else if((checkScience2()& checkvalue31()& valuecheck41())&(o4.isPressed())){

            int count22=2;
            scoree.setText(count22+"/4");



        }
        //2

        else if((checkScience3()& checkvalue31()& valuecheck41())&(o4.isPressed())){

            int count23=1;
            scoree.setText(count23+"/4");



        }
        //3
        else if((checkScience4()& checkvalue31()& valuecheck41())&(o4.isPressed())){
            int count24=1;
            scoree.setText(count24+"/4");

        }
        //4

        else if((checkScience1()& checkvalue32()& valuecheck41())&(o4.isPressed())){
            int count25=0;
            scoree.setText(count25+"/4");

        }


        //5

        else if((checkScience2()& checkvalue32()& valuecheck41())&(o4.isPressed())){
            int count26=1;
            scoree.setText(count26+"/4");

        }

        //6
        else if((checkScience3()& checkvalue32()& valuecheck41())&(o4.isPressed())){
            int count27=0;
            scoree.setText(count27+"/4");

        }
        //7
        else if((checkScience4()& checkvalue32()& valuecheck41())&(o4.isPressed())){
            int count28=0;
            scoree.setText(count28+"/4");

        }
        else if((checkScience1()& checkvalue33()& valuecheck41())&(o4.isPressed())){
            int count29=0;
            scoree.setText(count29+"/4");

        }
        //8

        else if((checkScience2()& checkvalue33()& valuecheck41())&(o4.isPressed())){
            int count30=1;
            scoree.setText(count30+"/4");

        }
        //9
        else if((checkScience3()& checkvalue33()& valuecheck41())&(o4.isPressed())){
            int count31=0;
            scoree.setText(count31+"/4");

        }
        //10
        else if((checkScience4()& checkvalue33()& valuecheck41())&(o4.isPressed())){
            int count32=0;
            scoree.setText(count32+"/4");

        }
        //11
        else if((checkScience1()& checkvalue34()& valuecheck41())&(o4.isPressed())){
            int count33=0;
            scoree.setText(count33+"/4");

        }
//12
        else if((checkScience2()& checkvalue31()& valuecheck42())&(o4.isPressed())){
            int count34=3;
            scoree.setText(count34+"/4");

        }
        //13

        else if((checkScience1()& checkvalue31()& valuecheck44())&(o4.isPressed())){
            int count35=2;
            scoree.setText(count35+"/4");

        }

        //14
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o4.isPressed())){
            int count36=2;
            scoree.setText(count36+"/4");

        }
        //15
        else if((checkScience4()& checkvalue31()& valuecheck42())&(o4.isPressed())){
            int count37=2;
            scoree.setText(count37+"/4");

        }

        //16




        else if((checkScience1()& checkvalue31()& valuecheck44())&(o4.isPressed())){
            int count38=1;
            scoree.setText(count38+"/4");

        }
        //17
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o4.isPressed())){
            int count39=2;
            scoree.setText(count39+"/4");

        }



        //18

        else if((checkScience3()& checkvalue31()& valuecheck44())&(o4.isPressed())) {
            int count40 = 2;
            scoree.setText(count40 + "/4");
        }
        //19
        else if((checkScience4()& checkvalue31()& valuecheck43())&(o4.isPressed())){
            int count41=1;
            scoree.setText(count41+"/4");

        }
        //20
        else if((checkScience1()& checkvalue31()& valuecheck44())&(o4.isPressed())){
            int count42=1;
            scoree.setText(count42+"/4");

        }
        //21
        else if((checkScience2()& checkvalue31()& valuecheck44())&(o4.isPressed())){
            int count43=2;
            scoree.setText(count43+"/4");

        }
        //22
        else if((checkScience4()& checkvalue31()& valuecheck44())&(o4.isPressed())){
            int count44=1;
            scoree.setText(count44+"/4");

        }
        //23
        else if((checkScience1()& checkvalue32()& valuecheck44())&(o4.isPressed())){
            int count45=0;
            scoree.setText(count45+"/4");

        }

        //24
        else if((checkScience2()& checkvalue32()& valuecheck44())&(o4.isPressed())){
            int count46=1;
            scoree.setText(count46+"/4");

        }
        //25
        else if((checkScience3()& checkvalue32()& valuecheck44())&(o4.isPressed())){
            int count47=2;
            scoree.setText(count47+"/4");

        }
        //26
        else if((checkScience4()& checkvalue32()& valuecheck44())&(o4.isPressed())){
            int count48=0;
            scoree.setText(count48+"/4");

        }
        //27
        else if((checkScience1()& checkvalue33()& valuecheck44())&(o4.isPressed())){
            int count49=0;
            scoree.setText(count49+"/4");

        }
        //28
        else if((checkScience1()& checkvalue34()& valuecheck44())&(o4.isPressed())){
            int count50=0;
            scoree.setText(count50+"/4");

        }
        //29

        else if((checkScience2()& checkvalue34()& valuecheck44())&(o4.isPressed())){
            int count51=1;
            scoree.setText(count51+"/4");

        }
        //30
        else if((checkScience3()& checkvalue34()& valuecheck44())&(o4.isPressed())){
            int count52=0;
            scoree.setText(count52+"/4");

        }
        else if((checkScience4()& checkvalue34()& valuecheck44())&(o4.isPressed())){
            int count53=0;
            scoree.setText(count53+"/4");

        }
        else if((checkScience4()& checkvalue34()& valuecheck44())&(o4.isPressed())){
            int count53=0;
            scoree.setText(count53+"/4");

        }
        else{
            Toast.makeText(getApplicationContext(),"Score",Toast.LENGTH_SHORT).show();
        }

        startTimerr();

    }







}