package com.example.fosclass1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView btnsegitiga = findViewById(R.id.tombolsegitiga);
        CardView btnpersegi = findViewById(R.id.persegi);
        CardView btnlingkaran = findViewById(R.id.lingkaran);
        CardView btnpp = findViewById(R.id.persegipanjang);

        /* user input angka 1 -> user input sngka 2 -> (klik)button -> (angka1+angka2)*/
        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent activityhasil = new Intent(MainActivity.this,HasilActivity.class);
               activityhasil.putExtra("BANGUNDATAR","Segitiga");
               startActivity(activityhasil);
            }
        });




        btnpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityhasil = new Intent(MainActivity.this,HasilActivity.class);
                activityhasil.putExtra("BANGUNDATAR","Persegi");
                startActivity(activityhasil);
            }
        });

        btnlingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityhasil = new Intent(MainActivity.this,HasilActivity.class);
                activityhasil.putExtra("BANGUNDATAR","Lingkaran");
                startActivity(activityhasil);
            }
        });

        btnpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activityhasil = new Intent(MainActivity.this,HasilActivity.class);
                activityhasil.putExtra("BANGUNDATAR","Persegi Panjang");
                startActivity(activityhasil);
            }
        });
    }
}