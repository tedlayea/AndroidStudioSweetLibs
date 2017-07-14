package com.example.sweetsweetsweet.sweet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initiate a WebView
        WebView sampleWebView=(WebView) findViewById(R.id.sampleWebView);
        // Defining the url
        String url="file:///android_asset/index.html";
        //Enable JavaScript
        sampleWebView.getSettings().setJavaScriptEnabled(true);
        sampleWebView.getSettings().setJavaScriptEnabled(true);
        //To handle all Chrome functions
        //start load function
        sampleWebView.loadUrl(url);
        // Define variable to hold the value in order to check he possiblity of going backward in history
        Boolean backward=sampleWebView.canGoBackOrForward();
        // Define variable to hold the value in order to check he possiblity of going forward in history
        Boolean forward=sampleWebView.canGoForward();
        //To clear the backward and forwardhistory
        sampleWebView.clearHistory();

    }
}
