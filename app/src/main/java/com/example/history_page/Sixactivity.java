package com.example.history_page;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


public class Sixactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamazidan); // ganti sesuai nama layout kamu

        ImageButton btnBack = findViewById(R.id.kembali);

        btnBack.setOnClickListener(v -> {
            // Balik ke MainActivity
            Intent intent = new Intent(Sixactivity.this, Fiveactivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_left, 0);
            finish(); // opsional: supaya SecondActivity ditutup
        });
        ImageButton btnNext = findViewById(R.id.selanjutnya); // pastikan ID sama di XML

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Sixactivity.this, MainActivity.class);
            startActivity(intent);
        });
        ImageButton btnHome = findViewById(R.id.homehome); // pastikan ID sama di XML

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(Sixactivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}