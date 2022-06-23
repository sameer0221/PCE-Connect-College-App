package com.example.pceconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity18 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter18 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("7 SEM");
        /*TextView mtitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mtitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/

        /*toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));*/


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "DWM",
                R.drawable.hexaware,
                ""));


        productList.add(new Product(1,
                "LP",
                R.drawable.tcs_logo,
                ""));


        productList.add(new Product(1,
                "TCP AND IP",
                R.drawable.cognizent,
                ""));


        productList.add(new Product(1,
                "ACA",
                R.drawable.wipro_logo,
                ""));



        productList.add(new Product(1,
                "PNA",
                R.drawable.wipro_logo,
                ""));


        productList.add(new Product(1,
                "BDA AND BI",
                R.drawable.wipro_logo,
                ""));



        productList.add(new Product(1,
                "CG",
                R.drawable.wipro_logo,
                ""));



        productList.add(new Product(1,
                "MC",
                R.drawable.wipro_logo,
                ""));



        productList.add(new Product(1,
                "RTOS",
                R.drawable.wipro_logo,
                ""));



        productList.add(new Product(1,
                "SA",
                R.drawable.wipro_logo,
                ""));



        productList.add(new Product(1,
                "MT",
                R.drawable.wipro_logo,
                ""));








        adapter = new ProductAdapter18(this,productList);
        recyclerView.setAdapter(adapter);


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Animation animation = AnimationUtils.loadAnimation(this,R.anim.anim_about_card_show);
        RelativeLayout relativeLayout = findViewById(R.id.rl);
        recyclerView.setAnimation(animation);







    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuji,menu);
        MenuItem menuItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s.toString());
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MainActivity18.this,NotesPS.class);
        startActivity(intent);
    }


}