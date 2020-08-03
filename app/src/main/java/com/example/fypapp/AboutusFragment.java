package com.example.fypapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutusFragment extends Fragment { // ye error is liye aa raha hai because tmhari ye class jo k mian class hai wo AppCompatActivity se extend ni ho rahi

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view2 = inflater.inflate(R.layout.fragment_aboutus,container,false);
        WebView webView2 = view2.findViewById(R.id.aboutus_webview);
        webView2.loadUrl("http://192.168.10.5/project/about-us.html");
        WebSettings webSettings = webView2.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view2;
    }



}
