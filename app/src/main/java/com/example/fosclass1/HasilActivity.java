package com.example.fosclass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        Intent intent = getIntent();
        String bgn = intent.getStringExtra("BANGUNDATAR");

        TextView hasil = findViewById(R.id.hasil);
        TextView hasilnya = findViewById(R.id.hasilnya);
        hasil.setText(bgn);

        switch (bgn){
            case "Persegi":
                Log.d("Bangun", "Terpilih");
                Persegi psg = new Persegi();
                psg.sisi = 5;
                psg.warna = "merah";
                psg.hitungLuas();
                psg.hitungLuas();
                Log.d("Bangun", String.valueOf(psg.hitungLuas()));
                hasilnya.setText(String.valueOf(psg.hitungLuas()));
                break;
            case "Segitiga":
                //------
                break;
            default:
                break;
        }


    }
}