package com.genuss.oldies_genuss;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nineoldandroids.animation.Animator;

/**
 * Created by user on 21/02/2016.
 */
public class Categories extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        WebView mWebView = (WebView)findViewById(R.id.webView);
        mWebView.loadUrl("http://southtruckcentral.com.mx/oldies/");

    }
}
