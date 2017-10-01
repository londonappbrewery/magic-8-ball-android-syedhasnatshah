package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay=(ImageView) findViewById(R.id.image_eightBall);
        final int [] array_for_referenc={R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        final Button myButton=( Button) findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random RandomNumberGenerator= new Random(); /* Here We are creating an object of class Random*/
                int number=RandomNumberGenerator.nextInt(5); /* Now you are calling a class function using object of that class and assigning the return value to ineteger variable */
                ballDisplay.setImageResource(array_for_referenc[number]);
                Log.d("Pressed"," Number is "+number);
            }
        });
    }
}
