package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_modul2;

/**
 * Created by dwima on 2/18/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> rvData,rvHarga;
    private ArrayList<Integer> foto;


    public RecyclerViewAdapter(ArrayList<String> inputData, ArrayList<String> dataHarga, ArrayList<Integer> gambar) {
        rvData = inputData;
        rvHarga = dataHarga;
        foto = gambar;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvSubtitle;
        public ImageView a;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);

            //Untuk Menghubungkan dan Mendapakan Context dari MenuActivity
            context = itemView.getContext();
            //melakukan inisiasi TextView, ImageView dan LinearLayoout
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            a = (ImageView) v.findViewById(R.id.icon);
            ItemList = v.findViewById(R.id.list);

            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(context,DetailMenuActivity.class);
                    String ingredient ="";
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "Nasi,Telur, Kecap Manis, Saos, Timun, Tomat, Bumbu Nasi Goreng";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "Mie telor, Bakso Sapi, kaldu sapi, pangsit";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "lele, sambal, garam ";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "mie ramen, daging ayam, jamur shitake, sayur pokcoy";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "daging ayam, wortel, lobak, daun bawang, kaldu ayam";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            intent.putExtra("judul",rvData.get(getAdapterPosition()));
                            intent.putExtra("harga",rvHarga.get(getAdapterPosition()));
                            intent.putExtra("gambar",foto.get(getAdapterPosition()));
                            ingredient = "Daging ayam suir, toge, telur, bihun";
                            intent.putExtra("komposisi",ingredient);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_list, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        final String harga = rvHarga.get(position);
        final Integer test = foto.get(position);
        holder.tvTitle.setText(name);
        holder.tvSubtitle.setText(harga);
        holder.a.setImageResource(test);

    }

    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}