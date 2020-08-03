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

public class PortalLoginFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState)
    {


        View view5 = inflater.inflate(R.layout.fragment_portallogin,container,false);
        WebView webView5 = view5.findViewById(R.id.portallogin_webview);
        webView5.loadUrl("http://192.168.10.5/project/fyp/index.php");
        WebSettings webSettings = webView5.getSettings();
        webSettings.setJavaScriptEnabled(true);

        return view5;
    }

}
