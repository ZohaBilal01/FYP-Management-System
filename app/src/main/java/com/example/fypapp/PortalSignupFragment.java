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

public class PortalSignupFragment  extends Fragment { // ye error is liye aa raha hai because tmhari ye class jo k mian class hai wo AppCompatActivity se extend ni ho rahi

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {


        View view5 = inflater.inflate(R.layout.fragment_portallogin,container,false);
        WebView webView5 = view5.findViewById(R.id.portallogin_webview);
        webView5.loadUrl("http://192.168.10.5/project/fyp/register.php");
        WebSettings webSettings = webView5.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view5;
    }
}
