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

public class MainActivity9 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter9 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("6 SEM");
        /*TextView mtitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mtitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/

        /*toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));*/


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "AI",
                R.drawable.hexaware,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/6th-sem-AI.pdf?alt=media&token=5e46b18a-546e-451c-950d-696b7ae57b7f"));
        productList.add(new Product(1,
                "DP",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/6-sem-DP.pdf?alt=media&token=7c2a47fd-0001-4d93-933e-7333a29f24ff"));
        productList.add(new Product(1,
                "SEPM",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/6-sem-sepm.pdf?alt=media&token=08d68238-63ae-419a-aad8-3786953daf29"));


        productList.add(new Product(1,
                "FE",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/6-sem-fe.pdf?alt=media&token=396fbc68-885f-4e1d-a0d0-3a0cb5b30367"));


        productList.add(new Product(1,
                "CN",
                R.drawable.infosys,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/6th-CN.pdf?alt=media&token=2f550507-fbdc-4d44-84fd-86f2657061c8"));




        adapter = new ProductAdapter9(this,productList);
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
        Intent intent = new Intent(MainActivity9.this,QuestionPS.class);
        startActivity(intent);
    }


}