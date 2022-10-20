package com.example.aplikasimenumakanan13294;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    ImageView img;
    TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        img = findViewById(R.id.img);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);

        Intent intent = getIntent();
        String nama = intent.getExtras().getString("nama");
        String harga = intent.getExtras().getString("harga");
        String deskripsi = intent.getExtras().getString("deskripsi");
        int image = intent.getExtras().getInt("foto");

        tv1.setText(nama);
        tv2.setText(harga);
        tv3.setText(deskripsi);
        img.setImageResource(image);

    }
}