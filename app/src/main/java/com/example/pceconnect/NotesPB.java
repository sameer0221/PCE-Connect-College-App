package com.example.pceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NotesPB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_pb);





    }

    public void Year(View view) {

        Intent intent = new Intent(NotesPB.this,NotesPS2.class);
        startActivity(intent);
    }

    public void CSE(View view) {

        Intent intent = new Intent(NotesPB.this,NotesPS.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(NotesPB.this,HomeActivity.class);
        startActivity(intent);
    }
}