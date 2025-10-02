package com.example.history_page;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;


public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanmufid); // ganti sesuai nama layout kamu

        ImageButton btnBack = findViewById(R.id.buttonprevious);

        btnBack.setOnClickListener(v -> {
            // Balik ke MainActivity
            Intent intent = new Intent(Secondactivity.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_left, 0);
            finish(); // opsional: supaya SecondActivity ditutup
        });
        ImageButton btnNext = findViewById(R.id.buttonnext); // pastikan ID sama di XML

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Secondactivity.this, Thirdactivity.class);
            startActivity(intent);
        });
        ImageButton btnHome = findViewById(R.id.buttonmenu); // pastikan ID sama di XML

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(Secondactivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}