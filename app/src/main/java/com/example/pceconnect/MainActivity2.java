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

public class MainActivity2 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter2 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


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
                "Hexaware",
                R.drawable.hexaware,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Hexawate%20technical%20paper.pdf?alt=media&token=b29f63d8-18af-4897-b701-b7bc06d8a6bb"));

        productList.add(new Product(1,
                "TCS",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Tcs%20technical%20papers.pdf?alt=media&token=79ae5542-4d88-4973-93ab-97e78c4709a9"));

        productList.add(new Product(1,
                "Cognizant",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Cognizant%20technical%20papers.pdf?alt=media&token=e1d4a7ca-8224-4480-8b9c-0138c08e4bee"));



        productList.add(new Product(1,
                "Wipro",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Wipro%20technical%20question%20paper.pdf?alt=media&token=71cfaf52-d821-46ab-9ff4-bf89c09ad052"));



        productList.add(new Product(1,
                "Infosys",
                R.drawable.infosys,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Infosys%20technical%20question%20paper.pdf?alt=media&token=2ee5db6a-bcda-4f16-99c1-21f2b8240094"));



        productList.add(new Product(1,
                "HCL",
                R.drawable.hcl,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/HCL%20technical%20question%20paper.pdf?alt=media&token=ea66f289-d246-416f-852f-3b36752b580d"));



        productList.add(new Product(1,
                "Amazon",
                R.drawable.amazon,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect.appspot.com/o/Amazon%20technical%20question%20papers.pdf?alt=media&token=2730b50a-eabd-452b-947c-eebf3501af5d"));





        adapter = new ProductAdapter2(this,productList);
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
        Intent intent = new Intent(MainActivity2.this,AptitudeTest.class);
        startActivity(intent);
    }


}