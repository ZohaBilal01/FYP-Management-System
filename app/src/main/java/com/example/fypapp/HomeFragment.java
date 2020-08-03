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

import java.util.List;

public class HomeFragment extends Fragment { // ye error is liye aa raha hai because tmhari ye class jo k mian class hai wo AppCompatActivity se extend ni ho rahi

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
       View view1 = inflater.inflate(R.layout.fragment_home,container,false);
        WebView webView1 = view1.findViewById(R.id.home_webview);
        webView1.loadUrl("http://192.168.10.5/project/index.php");
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view1;
    }


}

