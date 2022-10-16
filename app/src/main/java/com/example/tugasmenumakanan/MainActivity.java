package com.example.tugasmenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMakanan;
    private ArrayList<Makanan> listMakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMakanan = findViewById(R.id.rec_makanan);
        iniData();

        recMakanan.setAdapter(new MakananAdapter(listMakanan));
        recMakanan.setLayoutManager(new LinearLayoutManager(this));
    }

    private void iniData(){
        this.listMakanan = new ArrayList<>();
        listMakanan.add(new Makanan("Pecel lele",
                "10.000",
                "Warung pecel lele termurah",
                R.drawable.pecel_lele));

        listMakanan.add(new Makanan("Ayam Bakar",
                "50.000",
                "Warung ayam bakar dengan tambahan bisa nambah nasi gratis",
                R.drawable.ayam_bakar));

        listMakanan.add(new Makanan("Ayam geprek",
                "10.000",
                "Warung ayam geprek dengan sambal yang menggoda",
                R.drawable.ayam_geprek));
    }
}