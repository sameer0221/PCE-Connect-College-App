package com.example.pceconnect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;

    SliderView sliderView;
    ArrayList<Integer> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout);



        sliderView = findViewById(R.id.sliderView);

        arrayList.add(R.drawable.iamge1);
        arrayList.add(R.drawable.image2);
        arrayList.add(R.drawable.iamge3);
        arrayList.add(R.drawable.image4);
        arrayList.add(R.drawable.image7);

        ImageSlider imageSlider = new ImageSlider(HomeActivity.this,arrayList);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.DROP);
        sliderView.setSliderTransformAnimation(SliderAnimations.CUBEINDEPTHTRANSFORMATION);
        sliderView.setSliderAdapter(imageSlider);
        sliderView.startAutoCycle();



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setItemIconTintList(null);
        drawerLayout = findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open,
                R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


        navigationView.setNavigationItemSelectedListener(new
                                                                 NavigationView.OnNavigationItemSelectedListener() {
                                                                     @Override
                                                                     public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                                                                         switch (item.getItemId()) {
                                                                             // COMMON
                                                                             /*case R.id.facebookPage:
                                                                                 break;*/
                                                                             case R.id.website:




                                                                                 Intent wb1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pcenagpur.edu.in/?msclkid=d74d1793cec111ecbd7606f91f067abe"));
                                                                                 startActivity(wb1);

                                                                                 break;
                                                                             /*case R.id.nav_privacy_policy:
                                                                                 break;
                                                                             case R.id.nav_terms_conditions:
                                                                                 break;
                                                                             case R.id.more:
                                                                                 break;*/
                                                                             // COMMON
                                                                             // IMPORTANT //
                                                                             case R.id.nav_rate:


                                                                                 Uri uri = Uri.parse("market://details?id=" + getApplication().getPackageName());
                                                                                 Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                                                                                 // To count with Play market backstack, After pressing back button,
                                                                                 // to taken back to our application, we need to add following flags to intent.
                                                                                 if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                                                                     goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                                                                                             Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                                                                                             Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                                                                                 }
                                                                                 try {
                                                                                     startActivity(goToMarket);
                                                                                 } catch (ActivityNotFoundException e) {
                                                                                     startActivity(new Intent(Intent.ACTION_VIEW,
                                                                                             Uri.parse("http://play.google.com/store/apps/details?id=" + getApplication().getPackageName())));
                                                                                 }

                                                                                 break;
                                                                             // IMPORTANT //
                                                                             // IMPORTANT //
                                                                             case R.id.nav_share:

                                                                                 Intent shareIntent = new Intent(Intent.ACTION_SEND);
                                                                                 shareIntent.setType("text/plain");
                                                                                 shareIntent.putExtra(Intent.EXTRA_SUBJECT, "PCE Connect");
                                                                                 String shareMessage= "This Is Best Application For PCE Students.\n\n";
                                                                                 shareMessage = shareMessage + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID;
                                                                                 shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                                                                                 startActivity(Intent.createChooser(shareIntent, "choose one"));

                                                                                 break;
                                                                             // IMPORTANT //
                                                                         }
                                                                         return true;
                                                                     }
                                                                 });






    }



    public void Website(View view) {


        /*Intent intent = new Intent(HomeActivity.this,Websiteji.class);
        startActivity(intent);*/


        Intent wb1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pcenagpur.edu.in/"));
        startActivity(wb1);
    }

    public void ERP(View view) {
        /*Intent intent = new Intent(HomeActivity.this,Location.class);
        startActivity(intent);*/


        Intent wb1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://erp.ltjss.net/"));
        startActivity(wb1);


    }


    public void TimeTable(View view) {

        Intent intent = new Intent(HomeActivity.this,QuestionPB.class);
        startActivity(intent);
    }

    public void Calculator(View view) {
        Intent intent = new Intent(HomeActivity.this,SimpleCalculator.class);
        startActivity(intent);
    }

    public void Location(View view) {

        Intent intent = new Intent(HomeActivity.this,MapsActivity.class);
        startActivity(intent);
        /*Intent intent = new Intent(HomeActivity.this,Location.class);
        startActivity(intent);*/
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



    public void Result(View view) {

        Intent intent = new Intent(HomeActivity.this,Resultji.class);
        startActivity(intent);
    }

    public void News(View view) {

        Intent intent = new Intent(HomeActivity.this,NotesPB.class);
        startActivity(intent);


    }




}