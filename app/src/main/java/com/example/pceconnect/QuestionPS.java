package com.example.pceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionPS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ps);




        Button button1ji=(Button)findViewById(R.id.button1);
        Button button2ji=(Button)findViewById(R.id.button2);
        Button button3ji =(Button)findViewById(R.id.button3);
        Button button4ji =(Button)findViewById(R.id.button4);
        Button button5ji =(Button)findViewById(R.id.button5);
        Button button6ji =(Button)findViewById(R.id.button6);


        button1ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(intent);
            }
        });


        button2ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(intent);
            }
        });



        button3ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(intent);
            }
        });


        button4ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity9.class);
                startActivity(intent);
            }
        });

        button5ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity10.class);
                startActivity(intent);
            }
        });




        button6ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity11.class);
                startActivity(intent);
            }
        });




    }


    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),QuestionPB.class);
        startActivity(intent);
    }
}