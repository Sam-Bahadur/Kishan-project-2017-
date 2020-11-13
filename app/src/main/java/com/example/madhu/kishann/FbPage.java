package com.example.madhu.kishann;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class FbPage extends AppCompatActivity {
    private WebView webView=(WebView)findViewById(R.id.webView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fb_page);
//        webView.loadUrl("http://m.fb.com/openmyacc/");
        Intent i= new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/"));
        startActivity(i);
    }
}
