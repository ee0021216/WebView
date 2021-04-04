package com.webview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class Home extends AppCompatActivity {

    private WebView webView;

private static String MAP_URL = "file:///android_asset/0316vue/home.html";// 自建的html檔名

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m1701);
        setUpViewComponent();
    }

    private void setUpViewComponent() {
        webView=(WebView)findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(MAP_URL);
    }
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {//選擇哪個layout的檔名
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.main_finish:
                this.finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}