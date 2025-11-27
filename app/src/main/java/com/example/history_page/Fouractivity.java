package com.example.history_page;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;


public class Fouractivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halamanjavas); // ganti sesuai nama layout kamu

        ImageButton btnBack = findViewById(R.id.butonprevious);

        btnBack.setOnClickListener(v -> {
            // Balik ke MainActivity
            Intent intent = new Intent(Fouractivity.this, Thirdactivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_left, 0);
            finish(); // opsional: supaya SecondActivity ditutup
        });
        ImageButton btnNext = findViewById(R.id.butonnext); // pastikan ID sama di XML

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(Fouractivity.this, Fiveactivity.class);
            startActivity(intent);
            finish(); // opsional: supaya SecondActivity ditutup
        });
        ImageButton btnHome = findViewById(R.id.imageButtonHome); // pastikan ID sama di XML

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(Fouractivity.this, MainActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            finish(); // opsional: supaya SecondActivity ditutup
        });
    }
}