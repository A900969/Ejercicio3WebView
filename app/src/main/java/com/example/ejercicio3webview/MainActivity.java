package com.example.ejercicio3webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.ejercicio3webview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding enlace;
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enlace = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(enlace.getRoot());

        wv = enlace.webview;

        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://www.google.com");
    }
}