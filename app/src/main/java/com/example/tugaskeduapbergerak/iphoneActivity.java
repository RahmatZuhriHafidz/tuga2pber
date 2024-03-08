package com.example.tugaskeduapbergerak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class iphoneActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cardView1, cardView2, cardView3, cardView4, cardView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iphone);

        cardView1 = findViewById(R.id.cardView1);
        cardView2 = findViewById(R.id.cardView2);
        cardView3 = findViewById(R.id.cardView3);
        cardView4 = findViewById(R.id.cardView4);
        cardView5 = findViewById(R.id.cardView5);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.cardView1) {
            int imageView = R.drawable.iphone14pro;
            String text1 = "iPhone 14 Pro";
            String text2 = "REKAM VIDEO 4K,LAYAR SUPER RETINA XDR,RESOLUSI 2532 x 1170 px,HAPTIC TOUCH,CHIP A15 BIONIC";
            String text3 = "TOP 5 PENJUALAN TERBAIK 2022-2023";

            Intent BukaCvIphone1 = new Intent(iphoneActivity.this, DetailActivity.class);

            BukaCvIphone1.putExtra("Gambar", imageView);
            BukaCvIphone1.putExtra("EXTRA_NAME1", text1);
            BukaCvIphone1.putExtra("EXTRA_NAME2", text2);
            BukaCvIphone1.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIphone1);
        } else if (v.getId() == R.id.cardView2) {
            int imageView = R.drawable.iphone14promax;
            String text1 = "iPhone 14 Pro Max";
            String text2 = "REKAM VIDEO 4K 60 FPS,LAYAR SUPER RETINA XDR,RESOLUSI 2796 x 1290 px,DYNAMIC ISLAND,CHIP A16 BIONIC";
            String text3 = "DYNAMIC ISLAND PERTAMA DI SERIES IPHONE !!";

            Intent BukaCvIphone2 = new Intent(iphoneActivity.this, DetailActivity.class);

            BukaCvIphone2.putExtra("Gambar", imageView);
            BukaCvIphone2.putExtra("EXTRA_NAME1", text1);
            BukaCvIphone2.putExtra("EXTRA_NAME2", text2);
            BukaCvIphone2.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIphone2);
        } else if (v.getId() == R.id.cardView3) {
            int imageView = R.drawable.ip15biasa;
            String text1 = "iPhone 15 ";
            String text2 = "TAMPILAN PINK DENGAN CERAMIC SHIELD,RESOLUSI 2556 x 1179 px,DYNAMIC ISLAND,CHIP A16 BIONIC,FITUR IPHONE 14 LAINNYA";
            String text3 = "TAMPIL DENGAN CERAMIC SHIELD !!";

            Intent BukaCvIphone3 = new Intent(getApplicationContext(), DetailActivity.class);

            BukaCvIphone3.putExtra("Gambar", imageView);
            BukaCvIphone3.putExtra("EXTRA_NAME1", text1);
            BukaCvIphone3.putExtra("EXTRA_NAME2", text2);
            BukaCvIphone3.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIphone3);
        } else if (v.getId() == R.id.cardView4) {
            int imageView = R.drawable.ip15pro;
            String text1 = "iPhone 15 Pro ";
            String text2 = "TITANIUM,RESOLUSI 2796 x 1290 px,TEKNOLOGI PRO MOTION WITH 120Hz,REFRESH RATE, INCLUDE FITUR IPHONE 14 DAN 15";
            String text3 = "LAYAR ZOOM HINGGA 25x LEBIH JAUH !!";

            Intent BukaCvIphone4 = new Intent(getApplicationContext(), DetailActivity.class);

            BukaCvIphone4.putExtra("Gambar", imageView);
            BukaCvIphone4.putExtra("EXTRA_NAME1", text1);
            BukaCvIphone4.putExtra("EXTRA_NAME2", text2);
            BukaCvIphone4.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIphone4);
        } else if (v.getId() == R.id.cardView5) {
            int imageView = R.drawable.ip15promax;
            String text1 = "iPhone 15 Pro Max ";
            String text2 = "TITANIUM,RESOLUSI 2796 x 1290 px,TEKNOLOGI PRO MOTION WITH 120Hz,REFRESH RATE, INCLUDE FITUR IPHONE 14 DAN 15";
            String text3 = "LAYAR ZOOM HINGGA 25x LEBIH JAUH !!";

            Intent BukaCvIphone5 = new Intent(getApplicationContext(), DetailActivity.class);

            BukaCvIphone5.putExtra("Gambar", imageView);
            BukaCvIphone5.putExtra("EXTRA_NAME1", text1);
            BukaCvIphone5.putExtra("EXTRA_NAME2", text2);
            BukaCvIphone5.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIphone5);

        }

    }
    }
