package com.example.pceconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityjiok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainjiok);




        Button button1ji=(Button)findViewById(R.id.button1);
        Button button2ji=(Button)findViewById(R.id.button2);
        Button button3ji =(Button)findViewById(R.id.button3);
        Button button4ji =(Button)findViewById(R.id.button4);
        Button button5ji =(Button)findViewById(R.id.button5);
        Button button6ji =(Button)findViewById(R.id.button6);
        Button button7ji =(Button)findViewById(R.id.button7);






        button1ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity.class);
                startActivity(intent);
            }
        });


        button2ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity2.class);
                startActivity(intent);
            }
        });



        button3ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity3.class);
                startActivity(intent);
            }
        });


        button4ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity4.class);
                startActivity(intent);
            }
        });

        button5ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity5.class);
                startActivity(intent);
            }
        });




        button6ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity6.class);
                startActivity(intent);
            }
        });


        button7ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),QuestionsActivity7.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),AptitudeTest.class);
        startActivity(intent);
    }
}