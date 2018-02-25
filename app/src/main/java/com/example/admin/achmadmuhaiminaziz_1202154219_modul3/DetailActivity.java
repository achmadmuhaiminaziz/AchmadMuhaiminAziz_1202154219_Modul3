package com.example.admin.achmadmuhaiminaziz_1202154219_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    //membuat variabel untuk komponen yang ada
    private int counts = 1;
    private Button plus, minus;
    private TextView value, Judul, Detail;
    private ImageView galon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //membuat get intent dengan nama intent
        Intent intent = getIntent();
        //membuat variabel dan mengambil data dari intent sebelumnya
        String judul = intent.getStringExtra("judul");
        String caption = intent.getStringExtra("caption");
        String detail = intent.getStringExtra("detail");
        int gambar = intent.getIntExtra("gambar", 0);

        //membuat variabel sesuai dengan nama komponen yang ada
        Judul = findViewById(R.id.judul);
        Detail = findViewById(R.id.detail);
        ImageView imageGambar = findViewById(R.id.imageview);

        //set content atau komponen yang ada dari apaterAir
        setTitle(judul);
        Judul.setText(judul);
        Detail.setText(detail);
        imageGambar.setImageResource(gambar);

        //membuat variabel sesuai dengan komponen yang ada
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        value = findViewById(R.id.liter);
        galon = findViewById(R.id.galon);

        //set gambar sesuai dengan ukuran (untuk memulai pada saat dipanggil pertama kali)
        galon.setImageResource(R.drawable.ic_galon_20_black_24dp);
        value.setText(Integer.toString(counts) + "L");
    }

    //jika tombol minus diclik
    public void minus(View view) {
        //iterasi min untuk count
        counts--;
        //membuat kondisi jika galon tidak sama dengan kosong
        // kondisi akan menyesesuaikan dengan gambar dan menampilkan toast
        if (value != null) {
            //kondisi dengan variabel count
            switch (counts) {
                case 6:
                    galon.setImageResource(R.drawable.ic_galon_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Air Galon Sudah Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    galon.setImageResource(R.drawable.ic_galon_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    galon.setImageResource(R.drawable.ic_galon_80_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    galon.setImageResource(R.drawable.ic_galon_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    galon.setImageResource(R.drawable.ic_galon_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    galon.setImageResource(R.drawable.ic_galon_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Air Galon Akan Habis", Toast.LENGTH_LONG).show();
                    break;
            }
        }

    }

    //jika tombol minus diclik
    public void plus(View view) {
        //iterasi min untuk count
        counts++;
        //membuat kondisi jika galon tidak sama dengan kosong
        // kondisi akan menyesesuaikan dengan gambar dan menampilkan toast
        if (value != null) {
            //kondisi dengan variabel count
            switch (counts) {
                case 1:
                    galon.setImageResource(R.drawable.ic_galon_20_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Air Galon Akan Habis", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    galon.setImageResource(R.drawable.ic_galon_30_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    galon.setImageResource(R.drawable.ic_galon_50_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    galon.setImageResource(R.drawable.ic_galon_60_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    galon.setImageResource(R.drawable.ic_galon_90_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    galon.setImageResource(R.drawable.ic_galon_full_black_24dp);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Air Galon Sudah Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
