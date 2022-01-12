package com.zt.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      webview=findViewById(R.id.abcd);
      webview.setWebViewClient(new WebViewClient());
      webview.loadUrl("https://www.rex-d.com/");
    }
}