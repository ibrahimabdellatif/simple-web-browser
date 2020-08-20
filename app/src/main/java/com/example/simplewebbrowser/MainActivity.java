package com.example.simplewebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
      String search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView web1 = (WebView) findViewById(R.id.web);
        web1.setWebViewClient(new WebViewClient());
        web1.loadUrl("http://www.google.com");
        WebSettings webSettings = web1.getSettings();
        //add supporting javascript to the browser
        webSettings.setJavaScriptEnabled(true);
        webSettings.setPluginState(WebSettings.PluginState.ON);
        /*
        important permission to access webview put this line in mainfast file
            android:usesCleartextTraffic="true"
         */
    }
}