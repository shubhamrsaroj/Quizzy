package com.example.quizzy;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScienceResult extends AppCompatActivity {
    TextView tv1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_result);
        tv1 = findViewById(R.id.EIGTH);
        b1=findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkvalue31()){

                }

            }
        });

    }


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


        //5
        public boolean valuecheck51() {

            // Use the value of isButtonPressed as needed
            return Button51.isPressed;
        }
    public boolean valuecheck52() {

        // Use the value of isButtonPressed as needed
        return Button52.isPressed;
    }
    public boolean valuecheck53() {

        // Use the value of isButtonPressed as needed
        return Button53.isPressed;
    }
    public boolean valuecheck54() {

        // Use the value of isButtonPressed as needed
        return Button54.isPressed;
    }











}
