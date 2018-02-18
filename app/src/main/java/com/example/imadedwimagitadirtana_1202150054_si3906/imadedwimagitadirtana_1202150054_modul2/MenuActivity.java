package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataMenu;
    private ArrayList<String> dataHarga;
    private ArrayList<Integer> foto;
    private TextView x,y;

    //Daftar Menu Makanan
    private String[] Judul = {"Nasi Goreng", "Mie Bakso","Pecel Lele","Ramen","Sop Ayam","Soto Ayam"};
    //Daftar Harga
    private String[] harga = {"Rp. 15.000", "Rp. 15.000","Rp. 14.000","Rp. 22.000","Rp. 20.000","Rp. 20.000"};
    //Daftar Gambar
    private int[] Foto = {R.drawable.nasigoreng, R.drawable.miebakso,R.drawable.pecellele,R.drawable.ramen,R.drawable.sopayam,
            R.drawable.sotoayam};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        //mendeklarasikan array list untuk menu, harga dan gambar
        dataMenu = new ArrayList<>();
        dataHarga = new ArrayList<>();
        foto = new ArrayList<>();
        DaftarItem();


        rvView = (RecyclerView) findViewById(R.id.recyclerview);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(dataMenu,dataHarga,foto);
        rvView.setAdapter(adapter);

    }

    //Mengambil data dari Variable Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Recylcerview Adapter
    private void DaftarItem(){
        for (int w=0; w<Judul.length; w++){
            dataMenu.add(Judul[w]);
            dataHarga.add(harga[w]);
            foto.add(Foto[w]);
        }
    }


}
