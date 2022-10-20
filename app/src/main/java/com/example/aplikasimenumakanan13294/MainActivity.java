package com.example.aplikasimenumakanan13294;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new Model(R.drawable.nasigoreng,
                "Nasi Goreng",
                "Harga : Rp 12.000",
                "Nasi Goreng bisa request pedas atau tidak, lengkap dengan telur, irisan ayam dan sosis"));
        arrayList.add(new Model(R.drawable.baksomalang,
                "Bakso Malang",
                "Harga : Rp 10.000",
                "Bakso Malang dengan isian bakso, pangsit kering dan basah"));
        arrayList.add(new Model(R.drawable.mieayam,
                "Mie Ayam",
                "Harga : Rp 8.000",
                "Mie Ayam dengan topping ayam melimpah dan mie yang tebal"));
        arrayList.add(new Model(R.drawable.mietektek,
                "Mie Tek Tek",
                "Harga : Rp 10.000",
                "Mie Tek Tek Tek pedas khas burjo cabang 13294 dengan isian yang lengkap"));
        arrayList.add(new Model(R.drawable.esteh,
                "Es Teh",
                "Harga : Rp 3.000",
                "Es teh segar cocok untuk diminum bersama menu makanan lainnya"));

        ModelRecyclerView modelRecyclerView = new ModelRecyclerView(this,arrayList);
        recyclerView.setAdapter(modelRecyclerView);
    }
}