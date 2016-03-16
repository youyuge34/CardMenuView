package com.janseon.cardmenuview.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by renjunfan on 16/3/15.
 */
public class DramaTendersAcitivity extends Activity{

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daralayout);
//        webView = (WebView)findViewById(R.id.drama_web_view);
//        webView.getSettings().setJavaScriptEnabled(true);
//        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl("http://1.beidou.applinzi.com/?page_id=2");
        getPosition();
    }

    private void getPosition(){
        webView = (WebView)findViewById(R.id.drama_web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        Intent intent = getIntent();
        int position = intent.getIntExtra("position",6);
        switch (position){
            case 0:
                webView.loadUrl("http://www.baidu.com");/*交通*/
                break;
            case 1:
                webView.loadUrl("http://1.beidou.applinzi.com/?cat=8");/*农业*/
                break;
            case 2:
                webView.loadUrl("http://1.beidou.applinzi.com/?cat=15");/*安保*/
                break;
            case 3:
                webView.loadUrl("http://1.beidou.applinzi.com/?cat=13");/*生活*/
                break;
            case 4:
                webView.loadUrl("http://1.beidou.applinzi.com/?cat=14");/*自然*/
                break;
            case 5:
                webView.loadUrl("http://1.beidou.applinzi.com/?page_id=40");
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK&&webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
