package ir.abdolnasergharipour.webgardi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubYActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e4);

        WebView webView4 = findViewById(R.id.webView4);
        webView4.setWebViewClient(new WebViewClient()); // جلوگیری از باز شدن مرورگر خارجی

        WebSettings webSettings4 = webView4.getSettings();
        webSettings4.setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت

        webView4.loadUrl("https://yandex.com/"); // بارگذاری لینک موتور جستجو
    }
}

