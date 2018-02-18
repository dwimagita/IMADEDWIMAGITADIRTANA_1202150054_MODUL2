package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class DineinActivity extends AppCompatActivity {

    private TextInputLayout a,b;
    private Spinner c;
    String mSpinnerlabel = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);

        //inisiasi untuk Spinner

        c = (Spinner) findViewById(R.id.nomormeja);

        //memanggil array untuk menampung data yang ada pada spinner nantinya
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak kosong maka akan menset isi adapter dengan isi yang kita sudah masukkan di string.xml
        if (c != null){
            c.setAdapter(adapter);
        }


    }

    public void pilihpesanan(View view) {

        //inisiasi untuk TextInputLayot

        a = (TextInputLayout) findViewById(R.id.nama);

        //membuat string test agar spinner dapat dipilih
        String test = c.getSelectedItem().toString();

        //jika spinner null
        if (a ==null){
            Toast.makeText(this, R.string.isidata,Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 1 akan muncul toast  memilih meja 1
        else if (test.equalsIgnoreCase("Meja 1")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 1",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 2 akan muncul toast  memilih meja 2
        else if (test.equalsIgnoreCase("Meja 2")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 2",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 3 akan muncul toast memilih meja 3
        else if (test.equalsIgnoreCase("Meja 3")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 3",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 4 akan muncul toast memilih meja 4
        else if (test.equalsIgnoreCase("Meja 4")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 4",Toast.LENGTH_LONG).show();
        }
        //jika dipilih meja 5 akan muncul toast memilih meja 5
        else if (test.equalsIgnoreCase("Meja 5")){
            String nama = a.getEditText().getText().toString();
            Toast.makeText(this,"Anda " + nama + " Memilih Meja 5",Toast.LENGTH_LONG).show();
        }

        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent a = new Intent(DineinActivity.this,MenuActivity.class);
        startActivity(a);

    }
}