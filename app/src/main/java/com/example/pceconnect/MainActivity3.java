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

public class MainActivity3 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter3 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About Company");
        /*TextView mtitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mtitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/

        /*toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));*/


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "Hexaware",
                R.drawable.hexaware,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Hexaware%20technologies.pdf?alt=media&token=52edce35-8323-4dcd-8e53-56cde625fcf0"));

        productList.add(new Product(1,
                "TCS",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/TCS%20company.pdf?alt=media&token=a76ff585-0420-4a27-9822-bfc5deab7948"));

        productList.add(new Product(1,
                "Cognizant",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Cognizant%20technology.pdf?alt=media&token=a0bd1004-a39f-4c5e-a849-c5313d104fcd"));



        productList.add(new Product(1,
                "Wipro",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/wipro%20company.pdf?alt=media&token=0803e5e6-3327-4779-b7ca-d5f05465a280"));



        productList.add(new Product(1,
                "Infosys",
                R.drawable.infosys,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Infosys%20company.pdf?alt=media&token=011544bd-c94f-468a-9f37-84661cbe6df3"));



        productList.add(new Product(1,
                "HCL",
                R.drawable.hcl,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/HCL.pdf?alt=media&token=f550c507-a617-4c57-a3ae-4544ec3d9348"));



        productList.add(new Product(1,
                "Amazon",
                R.drawable.amazon,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Amazon.pdf?alt=media&token=07bb57fe-3ecd-4457-82e1-4d6f860a71d6"));






        adapter = new ProductAdapter3(this,productList);
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
        Intent intent = new Intent(MainActivity3.this,AptitudeTest.class);
        startActivity(intent);
    }


}