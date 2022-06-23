package com.example.pceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Erpji extends AppCompatActivity {


    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erpji);

        webView = findViewById(R.id.webview);

        ProgressDialog progressDialog = ProgressDialog.show(Erpji.this,"Loading","Please Wait",true);
        progressDialog.setCancelable(false);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                progressDialog.show();
                view.loadUrl(url);
                return  true;
            }


            @Override
            public void onPageFinished(WebView view, String url) {
                progressDialog.dismiss();
            }
        });


        webView.loadUrl("https://erp.ltjss.net/");




    }
}