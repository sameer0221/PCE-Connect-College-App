package com.example.pceconnect;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class pdf17 extends AppCompatActivity {

    PDFView pdfView;
    String link="",productlist="",product="";









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf17);








        pdfView = findViewById(R.id.pdfv17);


        if (isConnected())
        {
            Toast.makeText(getApplicationContext(), "Internet Connected", Toast.LENGTH_SHORT).show();
        }

        else{

            Toast.makeText(getApplicationContext(), "No Iinternet Connected", Toast.LENGTH_SHORT).show();
            AlertDialog.Builder builder = new AlertDialog.Builder(pdf17.this);
            builder.setTitle("Not Internet Connection Aleart")
                    .setMessage("Go To Setting ?")
                    .setCancelable(false)
                    .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            startActivity(new Intent(Settings.ACTION_WIRELESS_SETTINGS));
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(getApplicationContext(), "Go To Home Page", Toast.LENGTH_SHORT).show();
                        }
                    });

            AlertDialog dialog = builder.create();
            dialog.show();
        }


        link = getIntent().getStringExtra("title");
        productlist = getIntent().getStringExtra("productlist");
        product = getIntent().getStringExtra("link");



        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)

        {

            link = getIntent().getStringExtra("link");
        }

        new  RetrivePDFStream().execute(link);
    }


    class RetrivePDFStream extends AsyncTask<String,Void, InputStream>

    {


        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream = null;
            try {
                URL urlx = new URL(strings[0]);
                HttpURLConnection urlConnection = (HttpURLConnection) urlx.openConnection();
                if (urlConnection.getResponseCode() == 200)
                {

                    inputStream = new BufferedInputStream(urlConnection.getInputStream());

                }
            }

            catch (IOException ex)
            {

                return  null;
            }

            return inputStream;
        }

        ProgressDialog progressDialog;

        protected void onPreExecute()
        {

            progressDialog = new ProgressDialog(pdf17.this);
            progressDialog.setTitle("Getting The Content....");
            progressDialog.setMessage("Please wait.....");
            progressDialog.setCanceledOnTouchOutside(false);
            progressDialog.show();



        }

        protected void onPostExecute(InputStream inputStream)
        {
            pdfView.fromStream(inputStream).load();
            if (pdfView.isShown())

            {
                progressDialog.dismiss();
            }


        }
    }





    public  boolean isConnected(){

        boolean connected = Boolean.parseBoolean("false");
        try {
            ConnectivityManager cm = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo ninfo = cm.getActiveNetworkInfo();
            connected = ninfo!=null && ninfo.isAvailable() && ninfo.isConnected();
            return  connected;
        }
        catch (Exception e)
        {
            Log.e("Connectivity Exception",e.getMessage());
        }

        return  connected;
    }

    public boolean onOptionsItemSelected(MenuItem item)

    {

        if (item.getItemId() == android.R.id.home)
        {
            onBackPressed();
            return true;
        }

        return false;
    }


    @Override
    public void onBackPressed() {

        Intent intent = new Intent(pdf17.this,MainActivity17.class);
        startActivity(intent);
    }
}