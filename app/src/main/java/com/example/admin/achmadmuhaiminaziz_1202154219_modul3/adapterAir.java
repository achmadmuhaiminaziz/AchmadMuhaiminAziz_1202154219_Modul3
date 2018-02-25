package com.example.admin.achmadmuhaiminaziz_1202154219_modul3;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 2/25/2018.
 */

public class adapterAir extends RecyclerView.Adapter<adapterAir.ViewHolder> {
    //digunakan untuk menerima dan menyimpan list item dengan menggunakan arraylist
    private ArrayList<String> arrayListJudul, arrayListCaption;
    private ArrayList<Integer> arrayListGambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter (adapterAir)
    adapterAir(ArrayList<String> arrayListJudul, ArrayList<String> arrayListCaption, ArrayList<Integer> arrayListGambar) {
        this.arrayListJudul = arrayListJudul;
        this.arrayListCaption = arrayListCaption;
        this.arrayListGambar = arrayListGambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View yang akan dibuat
    public class ViewHolder extends RecyclerView.ViewHolder {
        //membuat variabel untuk component
        private TextView Judul, Caption;
        private ImageView Gambar;
        private LinearLayout itemList;

        public ViewHolder(View itemView) {
            super(itemView);
            //inisialisasi View-View untuk kita gunakan pada RecyclerView
            Judul = itemView.findViewById(R.id.judul);
            Caption = itemView.findViewById(R.id.caption);
            Gambar = itemView.findViewById(R.id.gambar);
            itemList = itemView.findViewById(R.id.list_item);
        }
    }

    @Override
    public adapterAir.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Membuat View untuk Menyiapkan dan Memasang Layout yang Akan digunakan pada RecyclerView
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(adapterAir.ViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        //Mengambil data sesuai dengan posisi yang telah ditentukan
        final String judul = arrayListJudul.get(position);
        final String caption = arrayListCaption.get(position);
        final Integer gambar = arrayListGambar.get(position);
        holder.Judul.setText(judul);
        holder.Caption.setText(caption);
        holder.Gambar.setImageResource(gambar);
        //Membuat Aksi pada Saat List Ditekan
        holder.itemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //membuat intent dari MainActivity ke DetailActivity
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                String detail = "    In a vault deep inside Abbey Road Studios in London — protected by an unmarked, triple-locked, police-alarmed door — are something like 400 hours of unreleased Beatles recordings, starting from June 2, 1962 and ending with the very last tracks recorded for the <i>Let It Be album. The best of the best were released by Apple Records in the form of the 3-volume Anthology series.\n" +
                        "        For more information, see the Beatles Time Capsule at www.rockument.com.\n" +
                        "Love Me Do — An early version of the song, played a bit slower and with more of a blues feeling, and a cool bossa-nova beat in middle. Paul had to sing while John played harmonica — a first for the group. Pete Best played drums on this version.\n" +
                        "\n" +
                        "   She Loves You – Till There Was You – Twist and Shout — Live at the Princess Wales Theatre by Leicester Square in London, attended by the Queen. “Till There Was You” (by Meredith Wilson) is from the musical The Music Man and a hit for Peggy Lee in 1961. Before playing it, Paul said it was recorded by his favorite American group, “Sophie Tucker” (which got some laughs). At the end, John tells the people in the cheaper seats to clap their hands, and the rest to “rattle your jewelry” and then announces “Twist and Shout” (a song by Bert Russell and Phil Medley that was first recorded in 1962 by the Isley Brothers). A film of the performance shows the Queen smiling at John’s remark.\n";
                //membuat switch pada posisi
                switch (position) {
                    //menentukan detail dari galon sesuai dengan judul atau merk dekripsi image pada array yang dibuat pada daftar air mineral
                    //membuat intent putExtra agar dapat diambil pada detail air mineral
                    case 0:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("judul", arrayListJudul.get(position));
                        intent.putExtra("caption", arrayListCaption.get(position));
                        intent.putExtra("gambar", arrayListGambar.get(position));
                        intent.putExtra("detail", detail);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    //memanggil agar disesuaikan dengan banyaknya item
    @Override
    public int getItemCount() {
        return arrayListJudul.size();
    }

}
