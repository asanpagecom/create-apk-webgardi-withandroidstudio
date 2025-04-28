package ir.abdolnasergharipour.webgardi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubZActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e2);

        WebView webView2 = findViewById(R.id.webView2);
        webView2.setWebViewClient(new WebViewClient()); // جلوگیری از باز شدن مرورگر خارجی

        WebSettings webSettings2 = webView2.getSettings();
        webSettings2.setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت

        webView2.loadUrl("https://zarebin.ir/"); // بارگذاری لینک موتور جستجو
    }
}

