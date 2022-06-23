

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

public class MainActivity4 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter4 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("1 SEM");
        /*TextView mtitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mtitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/

        /*toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));*/


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "M1",
                R.drawable.hexaware,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/1-sem-m1.pdf?alt=media&token=6827fb95-c2be-4990-b77d-f50ee9ec5473"));

        productList.add(new Product(1,
                "PHYSICS",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/1-sem-physics.pdf?alt=media&token=18b65722-7328-40ea-801f-624008e36fb9"));
        productList.add(new Product(1,
                "CHEMISTRY",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/1-sem-chemistry.pdf?alt=media&token=d2908a5a-6c70-4443-b912-98e39f29fe16"));


        productList.add(new Product(1,
                "EG",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/1-sem-eg.pdf?alt=media&token=6c22f512-d7d2-4a63-bfb3-e475d0a5f94b"));


        productList.add(new Product(1,
                "ELECTRICAL",
                R.drawable.infosys,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/1-sem-electrical.pdf?alt=media&token=87523084-01f9-484b-9294-47fe96fa10c3"));


        productList.add(new Product(1,
                "CIVIL",
                R.drawable.hcl,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/1-sem-civil.pdf?alt=media&token=9fcc6f38-3746-4493-b79a-405dc0ae6a6f"));







        adapter = new ProductAdapter4(this,productList);
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
        Intent intent = new Intent(MainActivity4.this,QuestionPS2.class);
        startActivity(intent);
    }


}

















