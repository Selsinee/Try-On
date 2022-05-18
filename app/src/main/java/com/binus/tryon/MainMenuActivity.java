package com.binus.tryon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import ai.deepar.deepar_example.R;
import ai.deepar.deepar_example.databinding.ActivityMainmenuBinding;

public class MainMenuActivity extends AppCompatActivity {

    private ActivityMainmenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainmenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.searchByProduct.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProductActivity.class);
            startActivity(intent);
        });

    }
}