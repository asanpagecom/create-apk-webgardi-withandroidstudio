package ir.abdolnasergharipour.webgardi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubSHActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e3);

        WebView webView3 = findViewById(R.id.webView3);
        webView3.setWebViewClient(new WebViewClient()); // جلوگیری از باز شدن مرورگر خارجی

        WebSettings webSettings3 = webView3.getSettings();
        webSettings3.setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت

        webView3.loadUrl("https://456.ir/"); // بارگذاری لینک موتور جستجو
    }
}

