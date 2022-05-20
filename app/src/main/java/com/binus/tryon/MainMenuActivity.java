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
            intent.putExtra(ProductActivity.EXTRA_PAGE, "Product");
            startActivity(intent);
        });
        binding.searchByBrand.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProductActivity.class);
            intent.putExtra(ProductActivity.EXTRA_PAGE, "Brand");
            startActivity(intent);
        });
        binding.searchByEye.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProductActivity.class);
            intent.putExtra(ProductActivity.EXTRA_PAGE, "Eye");
            startActivity(intent);
        });
        binding.searchByFace.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProductActivity.class);
            intent.putExtra(ProductActivity.EXTRA_PAGE, "Face");
            startActivity(intent);
        });
        binding.searchByLip.setOnClickListener(v -> {
            Intent intent = new Intent(this, ProductActivity.class);
            intent.putExtra(ProductActivity.EXTRA_PAGE, "Lip");
            startActivity(intent);
        });


    }
}