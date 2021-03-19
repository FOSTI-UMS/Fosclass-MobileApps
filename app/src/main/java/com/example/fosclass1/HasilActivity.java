package com.example.fosclass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Intent intent = getIntent();
        String bgn = intent.getStringExtra("BANGUNDATAR");

        TextView hasil = findViewById(R.id.hasil);
        hasil.setText(bgn);

    }
}