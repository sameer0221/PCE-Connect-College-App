package com.example.pceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AptitudeTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aptitude_test);





    }




    public void Company(View view) {
        Intent intent = new Intent(AptitudeTest.this,MainActivity3.class);
        startActivity(intent);


    }

    public void Apptitude(View view) {

        Intent intent = new Intent(AptitudeTest.this,MainActivity.class);
        startActivity(intent);
    }

    public void Technical(View view) {


        Intent intent = new Intent(AptitudeTest.this,MainActivity2.class);
        startActivity(intent);



    }




    public void Testji(View view) {

        Intent intent = new Intent(AptitudeTest.this,MainActivityjiok.class);
        startActivity(intent);
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(AptitudeTest.this,HomeActivity.class);
        startActivity(intent);
    }
}