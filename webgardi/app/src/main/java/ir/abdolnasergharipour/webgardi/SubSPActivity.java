package ir.abdolnasergharipour.webgardi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubSPActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e6);

        WebView webView6 = findViewById(R.id.webView6);
        webView6.setWebViewClient(new WebViewClient()); // جلوگیری از باز شدن مرورگر خارجی

        WebSettings webSettings6 = webView6.getSettings();
        webSettings6.setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت

        webView6.loadUrl("https://www.startpage.com/"); // بارگذاری لینک موتور جستجو
    }
}

