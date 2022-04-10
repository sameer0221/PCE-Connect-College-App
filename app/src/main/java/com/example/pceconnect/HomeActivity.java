package com.example.pceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }


    public void TimeTable(View view) {

        Intent intent = new Intent(HomeActivity.this,TimeTable.class);
        startActivity(intent);
    }

    public void Calculator(View view) {
        Intent intent = new Intent(HomeActivity.this,Calculator.class);
        startActivity(intent);
    }

    public void Location(View view) {
        Intent intent = new Intent(HomeActivity.this,Location.class);
        startActivity(intent);
    }

    public void AptitudeTest(View view) {

        Intent intent = new Intent(HomeActivity.this,AptitudeTest.class);
        startActivity(intent);
    }

    public void Faculties(View view) {

        Intent intent = new Intent(HomeActivity.this,Faculties.class);
        startActivity(intent);
    }

    public void Developer(View view) {

        Intent intent = new Intent(HomeActivity.this,Developer.class);
        startActivity(intent);
    }
}