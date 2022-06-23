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

public class MainActivity11 extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Product> productList;
    ProductAdapter11 adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("8 SEM");
        /*TextView mtitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mtitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);*/
        /*toolbar.setTitleTextColor(getResources().getColor(android.R.color.white));*/


        productList = new ArrayList<>();


        productList.add(new Product(1,
                "DOS",
                R.drawable.hexaware,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-DOS.pdf?alt=media&token=267f2533-19b7-41bc-b681-90aecdadb847"));


        productList.add(new Product(1,
                "ICS",
                R.drawable.tcs_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-ics.pdf?alt=media&token=5ee8a611-6402-4e17-8fec-508a3af04902"));

        productList.add(new Product(1,
                "PR",
                R.drawable.cognizent,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-PR.pdf?alt=media&token=20cb2e7b-6e58-442f-9a8b-233a051d9134"));



        productList.add(new Product(1,
                "SCT",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-sct.pdf?alt=media&token=c2b73544-08ee-42cf-9eba-0cb2d38f9854"));


        productList.add(new Product(1,
                "OT",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-OT.pdf?alt=media&token=c9ce9613-1178-440f-8a32-f90d56e2c705"));


        productList.add(new Product(1,
                "CCC",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-CCC.pdf?alt=media&token=4e842847-258d-42cf-87b9-5cb726870a80"));



        productList.add(new Product(1,
                "AWSN",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-awsn.pdf?alt=media&token=899b17e7-6897-472b-93d4-71bfc762a845"));


        productList.add(new Product(1,
                "DIP",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-dip.pdf?alt=media&token=60200a21-bf43-4208-9fae-5df71ec3a6e1"));




        productList.add(new Product(1,
                "NLP",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-nlp.pdf?alt=media&token=bec321e9-70d0-4655-8c4e-35f653ccf21f"));


        productList.add(new Product(1,
                "DIGITAL FORENSIC",
                R.drawable.wipro_logo,
                "https://firebasestorage.googleapis.com/v0/b/pce-connect-2.appspot.com/o/8-sem-df.pdf?alt=media&token=50cb8e97-cb44-4b67-81f7-a080fb2eb6f4"));







        adapter = new ProductAdapter11(this,productList);
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
        Intent intent = new Intent(MainActivity11.this,QuestionPS.class);
        startActivity(intent);
    }


}