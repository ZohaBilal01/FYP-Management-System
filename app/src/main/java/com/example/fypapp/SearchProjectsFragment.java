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

public class SearchProjectsFragment extends Fragment { // ye error is liye aa raha hai because tmhari ye class jo k mian class hai wo AppCompatActivity se extend ni ho rahi

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view3 = inflater.inflate(R.layout.fragment_searchprojects,container,false);
        WebView webView3 = view3.findViewById(R.id.SearchProjects_webview);
        webView3.loadUrl("http://192.168.10.5/project/searchprojects.php");
        WebSettings webSettings = webView3.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view3;
    }
}
