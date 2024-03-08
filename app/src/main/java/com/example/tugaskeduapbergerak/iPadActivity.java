package com.example.tugaskeduapbergerak;

import static com.example.tugaskeduapbergerak.R.id.cardViewipad1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class iPadActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cardViewipad1, cardViewipad2, cardViewipad3, cardViewipad4, cardViewipad5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipad);
        cardViewipad1 = findViewById(R.id.cardViewipad1);
        cardViewipad2 = findViewById(R.id.cardViewipad2);
        cardViewipad3 = findViewById(R.id.cardViewipad3);
        cardViewipad4 = findViewById(R.id.cardViewipad4);
        cardViewipad5 = findViewById(R.id.cardViewipad5);

        cardViewipad1.setOnClickListener(this);
        cardViewipad2.setOnClickListener(this);
        cardViewipad3.setOnClickListener(this);
        cardViewipad4.setOnClickListener(this);
        cardViewipad5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.cardViewipad1) {
            int imageView = R.drawable.ipadair5thgen;
            String text1 = "iPad Air 5th Generation";
            String text2 = "Tersedia dengan Memori hingga 1TB,5 Mikrofon,Teknologi Pro Motion, dengan Layar Warna Luas, serta Kecerahan mencapai 600 NIT";
            String text3 = "Tampil dengan Lensa Lima Elemen dan Mode Panorama hingga 63 Megapx";

            Intent BukaCvIpad1 = new Intent(iPadActivity.this, DetailActivity.class);

            BukaCvIpad1.putExtra("Gambar", imageView);
            BukaCvIpad1.putExtra("EXTRA_NAME1", text1);
            BukaCvIpad1.putExtra("EXTRA_NAME2", text2);
            BukaCvIpad1.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIpad1);
        } else if (v.getId() == R.id.cardViewipad2) {
            int imageView = R.drawable.ipad8thgen;
            String text1 = "iPad 8th Generation";
            String text2 = "Chipset A12 Bionic,Neural Engine,Rekam Video 1080HD pada 30fps,Layar Retina,Multitouch";
            String text3 = "Tersedia dalam warna Emas dan Perak !!!!";

            Intent BukaCvIpad2 = new Intent(iPadActivity.this, DetailActivity.class);

            BukaCvIpad2.putExtra("Gambar", imageView);
            BukaCvIpad2.putExtra("EXTRA_NAME1", text1);
            BukaCvIpad2.putExtra("EXTRA_NAME2", text2);
            BukaCvIpad2.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIpad2);
        } else if (v.getId() == R.id.cardViewipad3) {
            int imageView = R.drawable.ipad9thgen;
            String text1 = "iPad 9th Generation";
            String text2 = "Chipset A13 Bionic,Lapisan Oleophobic anti Sidik Jari,Kamera Ultra Wide,Mikrofon Ganda";
            String text3 = "Tersedia Mode Beruntun KAMERA DEPAN !!!!";

            Intent BukaCvIpad3 = new Intent(iPadActivity.this, DetailActivity.class);

            BukaCvIpad3.putExtra("Gambar", imageView);
            BukaCvIpad3.putExtra("EXTRA_NAME1", text1);
            BukaCvIpad3.putExtra("EXTRA_NAME2", text2);
            BukaCvIpad3.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIpad3);
        } else if (v.getId() == R.id.cardViewipad4) {
            int imageView = R.drawable.ipad10thgen;
            String text1 = "iPad 10th Generation";
            String text2 = "Layar Multi Touch dengan teknologi,Kecerahan 500 Nit,menggunakan Chipset A14 Bionic dengan Neural Engine 16-Core";
            String text3 = "Tersedia dalam Warna Biru dan Pink Limited !!";

            Intent BukaCvIpad4 = new Intent(iPadActivity.this, DetailActivity.class);

            BukaCvIpad4.putExtra("Gambar", imageView);
            BukaCvIpad4.putExtra("EXTRA_NAME1", text1);
            BukaCvIpad4.putExtra("EXTRA_NAME2", text2);
            BukaCvIpad4.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIpad4);
        } else if (v.getId() == R.id.cardViewipad5) {
            int imageView = R.drawable.ipadpro;
            String text1 = "iPad Pro 11th Generation ";
            String text2 = "Tersedia dengan Memori hingga 1TB,5 Mikrofon,Teknologi Pro Motion, dengan Layar Warna Luas, serta Kecerahan mencapai 600 NIT";
            String text3 = "Tampil dengan Lensa Lima Elemen dan Mode Panorama hingga 63 Megapx!!";

            Intent BukaCvIpad5 = new Intent(iPadActivity.this, DetailActivity.class);

            BukaCvIpad5.putExtra("Gambar", imageView);
            BukaCvIpad5.putExtra("EXTRA_NAME1", text1);
            BukaCvIpad5.putExtra("EXTRA_NAME2", text2);
            BukaCvIpad5.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIpad5);
        }
    }
}

