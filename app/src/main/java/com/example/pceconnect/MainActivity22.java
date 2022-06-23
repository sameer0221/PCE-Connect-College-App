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

public class MainActivity22 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter22 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Technical");
        /*TextView mtitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mtitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/

        /*toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));*/


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "Hexawarerohit",
                R.drawable.hexaware,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Hexaware%20aptitude%20test%20%20paper.pdf?alt=media&token=c3b18fc1-8163-4456-a2e5-677f72d72bbe"));

        productList.add(new Product(1,
                "TCS",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/TCS%20aptitude%20papers%F0%9F%93%84.pdf?alt=media&token=2fae3af0-c378-44d5-ae26-3cbf8e9a1b40"));

        productList.add(new Product(1,
                "Cognizant",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/cognizant%20aptitude%20papers%20%F0%9F%93%84.pdf?alt=media&token=0269b44d-3a55-4f69-8437-60bf3b2c2261"));



        productList.add(new Product(1,
                "Wipro",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/wipro%20model%20question%20paper.pdf?alt=media&token=1693d1ab-ef95-4faf-b10c-181be9ba9ce6"));



        productList.add(new Product(1,
                "Infosys",
                R.drawable.infosys,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Infosys%20aptitude%20test%20papers.pdf?alt=media&token=edae8e59-28b5-4d5a-835b-2deb02cb9c78"));



        productList.add(new Product(1,
                "HCL",
                R.drawable.hcl,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/HCL%20aptitude%20paper%20%F0%9F%93%84.pdf?alt=media&token=58ff5a59-f12f-446f-b1ab-68c97069b770"));



        productList.add(new Product(1,
                "Amazon",
                R.drawable.amazon,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Amazon%20aptitude%20question%20paper.pdf?alt=media&token=f74cb194-00c0-43d8-aefb-a11a897844a5"));






        adapter = new ProductAdapter22(this,productList);
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
        Intent intent = new Intent(MainActivity22.this,QuestionPS.class);
        startActivity(intent);
    }


}