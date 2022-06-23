package com.example.pceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
    }




    public void LinkDin1(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rohit-ghate-bb8236240"));
        startActivity(link);

    }


    public void Facebook1(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rohit.ghate.90"));
        startActivity(link);

    }

    public void GitHub1(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/rohit51111"));
        startActivity(link);

    }






    public void LinkDin2(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sameer-lonare-4140591b1/"));
        startActivity(link);

    }


    public void Facebook2(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/sameer.lonare.9"));
        startActivity(link);

    }

    public void GitHub2(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/sameer0221"));
        startActivity(link);

    }







    public void LinkDin3(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sandana-sunatkari-35754823a"));
        startActivity(link);

    }


    public void Facebook3(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sandana.sunatkari"));
        startActivity(link);

    }

    public void GitHub3(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/sandusunatkari"));
        startActivity(link);

    }




    public void LinkDin4(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/tanushree-jatav-750380223"));
        startActivity(link);

    }


    public void Facebook4(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100065137781944"));
        startActivity(link);

    }

    public void GitHub4(View view) {


        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Tanushreejatav/Tanushreejatav"));
        startActivity(link);

    }










    public void LinkDin(View view) {

        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(link);

    }

    public void Facebook(View view) {


        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(link);

    }

    public void GitHub(View view) {


        Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(link);

    }



}