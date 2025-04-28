package ir.abdolnasergharipour.webgardi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubDWActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e7);

        WebView webView7 = findViewById(R.id.webView7);
        webView7.setWebViewClient(new WebViewClient()); // جلوگیری از باز شدن مرورگر خارجی

        WebSettings webSettings7 = webView7.getSettings();
        webSettings7.setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت

        webView7.loadUrl("https://duckduckgo.com/"); // بارگذاری لینک موتور جستجو
    }
}

