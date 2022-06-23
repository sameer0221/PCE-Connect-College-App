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

public class MainActivity8 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter8 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("5 SEM");
        /*TextView mtitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mtitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/

        /*toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));*/


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "D-COM",
                R.drawable.hexaware,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/5-sem-DC.pdf?alt=media&token=f54aaa46-5283-49f2-9d20-9f330855bdb3"));
        productList.add(new Product(1,
                "OOP",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/5-sem-oops.pdf?alt=media&token=fbc0f460-dfd8-426c-9fda-0e383354cb35"));
        productList.add(new Product(1,
                "DBMS",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/5-sem-dbms.pdf?alt=media&token=2b77c68b-ab2d-4df0-92c5-9f30c7a1c06e"));


        productList.add(new Product(1,
                "DAA",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/5-sem-DAA.pdf?alt=media&token=051a84d5-1cbd-4039-b05d-79c17fcfc43f"));


        productList.add(new Product(1,
                "CG",
                R.drawable.infosys,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/5-sem-CG.pdf?alt=media&token=bbaed609-724e-4228-b5f8-3643f832228f"));







        adapter = new ProductAdapter8(this,productList);
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
        Intent intent = new Intent(MainActivity8.this,QuestionPS.class);
        startActivity(intent);
    }


}