package com.example.history_page;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;


public class Fiveactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanrifqi); // ganti sesuai nama layout kamu

        ImageButton btnBack = findViewById(R.id.buttonback);

        btnBack.setOnClickListener(v -> {
            // Balik ke MainActivity
            Intent intent = new Intent(Fiveactivity.this, Fouractivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_left, 0);
            finish(); // opsional: supaya SecondActivity ditutup
        });
        ImageButton btnNext = findViewById(R.id.buttongo); // pastikan ID sama di XML

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Fiveactivity.this, Sixactivity.class);
            startActivity(intent);
        });
    }
}