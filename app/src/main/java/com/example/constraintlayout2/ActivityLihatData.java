package com.example.constraintlayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;
     String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        Bundle b = getIntent().getExtras();
        nama = b.getString("a");

        tvnama = (TextView) findViewById(R.id.tvNamaKontak);
        tvnomor = (TextView) findViewById(R.id.tvNomorTelepon);

        switch (nama)
        {
            case "Yasmina":
                tvnama.setText("Yasmina Azzahra");
                tvnomor.setText("666");
                break;
            case "Sekar":
                tvnama.setText("Sekar Putri");
                tvnomor.setText("666");
                break;
            case "Fadhil":
                tvnama.setText("Fadhillah Rizky");
                tvnomor.setText("666");
                break;
            case "Rio":
                tvnama.setText("Rio Anggara");
                tvnomor.setText("666");
                break;
            case "Arif":
                tvnama.setText("M Arif");
                tvnomor.setText("666");
                break;
            case "Adel":
                tvnama.setText("Adellia Pingkan");
                tvnomor.setText("666");
                break;
            case "Indah":
                tvnama.setText("Sisilia Indah");
                tvnomor.setText("666");
                break;
        }
    }
}