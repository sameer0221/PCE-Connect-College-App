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

public class MainActivity10 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter10 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


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
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-dwm.pdf?alt=media&token=78157f5e-993b-410a-9280-faed52704547"));

        productList.add(new Product(1,
                "LP",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-LP.pdf?alt=media&token=6a980fcb-7ca6-46e9-95cb-3689c4e5f00e"));

        productList.add(new Product(1,
                "TCP AND IP",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-tcpip.pdf?alt=media&token=78224851-95bc-46bb-a43c-194d8be5f2b6"));


        productList.add(new Product(1,
                "ACA",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-aca.pdf?alt=media&token=370c547c-895e-4c15-9b22-47c21c51d981"));



        productList.add(new Product(1,
                "PNA",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-pna.pdf?alt=media&token=5acf79ef-2025-4457-ba1c-a9b6eba7547b"));


        productList.add(new Product(1,
                "BDA AND BI",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-bdabi.pdf?alt=media&token=0afa2453-94f7-4ff7-aea1-4a437f1514d4"));



        productList.add(new Product(1,
                "CG",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-CG.pdf?alt=media&token=ed9f512e-dad6-40f6-a3bc-3fc0e601b050"));



        productList.add(new Product(1,
                "MC",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-MC.pdf?alt=media&token=13cb68a2-3893-4de6-9584-4eb1a2eaa694"));



        productList.add(new Product(1,
                "RTOS",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-rtos.pdf?alt=media&token=4481ac88-e2d4-440b-b27b-f3d748a325df"));



        productList.add(new Product(1,
                "SA",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-SA.pdf?alt=media&token=326950a0-a38f-4989-b97a-48f0b299456c"));



        productList.add(new Product(1,
                "MT",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/7-sem-MT.pdf?alt=media&token=78643719-6d80-4c00-aaea-d37c5eeec18f"));







        adapter = new ProductAdapter10(this,productList);
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
        Intent intent = new Intent(MainActivity10.this,QuestionPS.class);
        startActivity(intent);
    }


}