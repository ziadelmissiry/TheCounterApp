package com.example.thecounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView Welcome_text, counter_text; // declare multiple declarations
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        counter_text = findViewById(R.id.counterText);
        Welcome_text = findViewById(R.id.textView);
        //Adding functionality
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_text.setText("" + increaseCounter());

            }
        });



    }
// function that just adds one to the var counter
    public int increaseCounter(){
        return counter+=1;

    }
}