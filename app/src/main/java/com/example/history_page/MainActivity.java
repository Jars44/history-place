package com.example.history_page;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ImageButton btnMove = findViewById(R.id.btn_move);

        btnMove.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FirstBuildActivity.class);
            startActivity(intent);
        });
    }
}
