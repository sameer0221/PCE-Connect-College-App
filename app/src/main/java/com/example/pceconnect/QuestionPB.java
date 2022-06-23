package com.example.pceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuestionPB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_pb);





    }

    public void Year(View view) {

        Intent intent = new Intent(QuestionPB.this,QuestionPS2.class);
        startActivity(intent);
    }

    public void CSE(View view) {

        Intent intent = new Intent(QuestionPB.this,QuestionPS.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(QuestionPB.this,HomeActivity.class);
        startActivity(intent);
    }
}