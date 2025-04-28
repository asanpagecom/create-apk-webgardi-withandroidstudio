package ir.abdolnasergharipour.webgardi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubGActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);

        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // جلوگیری از باز شدن مرورگر خارجی

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت

        webView.loadUrl("https://www.google.com"); // بارگذاری لینک موتور جستجو
    }
}

