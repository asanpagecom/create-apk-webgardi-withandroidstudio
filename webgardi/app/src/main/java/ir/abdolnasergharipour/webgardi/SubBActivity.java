package ir.abdolnasergharipour.webgardi;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class SubBActivity extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e5);

        WebView webView5 = findViewById(R.id.webView5);
        webView5.setWebViewClient(new WebViewClient()); // جلوگیری از باز شدن مرورگر خارجی

        WebSettings webSettings5 = webView5.getSettings();
        webSettings5.setJavaScriptEnabled(true); // فعال کردن جاوااسکریپت

        webView5.loadUrl("https://www.baidu.com/"); // بارگذاری لینک موتور جستجو
    }
}

