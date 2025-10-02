package com.example.history_page;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;


public class Thirdactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanfajar); // ganti sesuai nama layout kamu

        ImageButton btnBack = findViewById(R.id.back);

        btnBack.setOnClickListener(v -> {
            // Balik ke MainActivity
            Intent intent = new Intent(Thirdactivity.this, Secondactivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_left, 0);
            finish(); // opsional: supaya SecondActivity ditutup
        });
        ImageButton btnNext = findViewById(R.id.next); // pastikan ID sama di XML

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Thirdactivity.this, Fouractivity.class);
            startActivity(intent);
        });
        ImageButton btnHome = findViewById(R.id.butonhome); // pastikan ID sama di XML

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(Thirdactivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}