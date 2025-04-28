package ir.abdolnasergharipour.webgardi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // مقداردهی دکمه پس از setContentView
        Button button = findViewById(R.id.button);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);

        // تنظیم Listener برای دکمه
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubGActivity.class);
            startActivity(intent);
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubZActivity.class);
            startActivity(intent);
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubSHActivity.class);
            startActivity(intent);
        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubZActivity.class);
            startActivity(intent);
        });
        button5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubSHActivity.class);
            startActivity(intent);
        });
        button6.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubZActivity.class);
            startActivity(intent);
        });
        button7.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SubSHActivity.class);
            startActivity(intent);
        });

    }
}