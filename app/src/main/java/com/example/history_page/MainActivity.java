package com.example.history_page;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView btnPage1, btnPage2, btnPage3, btnPage4, btnPage5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // XML utama kamu

        // Hubungkan button dengan id di XML
        btnPage1 = findViewById(R.id.imageview21);
        btnPage2 = findViewById(R.id.imageView9);
        btnPage3 = findViewById(R.id.imageView20);
        btnPage4 = findViewById(R.id.imageView16);
        btnPage5 = findViewById(R.id.imageView21);

        // Klik Button → pindah ke halaman lain
        btnPage1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Secondactivity.class);
            startActivity(intent);
        });

        btnPage2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Thirdactivity.class);
            startActivity(intent);
        });

        btnPage3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Fouractivity.class);
            startActivity(intent);
        });

        btnPage4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Fiveactivity.class);
            startActivity(intent);
        });

        btnPage5.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Sixactivity.class);
            startActivity(intent);
        });
    }
}