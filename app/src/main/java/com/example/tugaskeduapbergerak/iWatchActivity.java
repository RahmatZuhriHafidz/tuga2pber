package com.example.tugaskeduapbergerak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class iWatchActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView cardViewiwatch1, cardViewiwatch2, cardViewiwatch3, cardViewiwatch4, cardViewiwatch5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iwatch);
        cardViewiwatch1 = findViewById(R.id.cardViewiwatch1);
        cardViewiwatch2 = findViewById(R.id.cardViewiwatch2);
        cardViewiwatch3 = findViewById(R.id.cardViewiwatch3);
        cardViewiwatch4 = findViewById(R.id.cardViewiwatch4);
        cardViewiwatch5 = findViewById(R.id.cardViewiwatch5);

        cardViewiwatch1.setOnClickListener(this);
        cardViewiwatch2.setOnClickListener(this);
        cardViewiwatch3.setOnClickListener(this);
        cardViewiwatch4.setOnClickListener(this);
        cardViewiwatch5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cardViewiwatch1) {
            int imageView = R.drawable.applewatchnike;
            String text1 = "AppleWatch Nike";
            String text2 = "Apple dan Nike telah memotivasi banyak orang untuk berlari selama bertahun-tahun";
            String text3 = "AppleWatch Nike, Dirancang untuk para pelari, atlet, dan penggemar olahraga, iWatch Nike akan menjadi mitra sempurna Anda dalam setiap langkah perjalanan Anda.";

            Intent BukaCvIwatch1 = new Intent(iWatchActivity.this, DetailActivity.class);

            BukaCvIwatch1.putExtra("Gambar", imageView);
            BukaCvIwatch1.putExtra("EXTRA_NAME1", text1);
            BukaCvIwatch1.putExtra("EXTRA_NAME2", text2);
            BukaCvIwatch1.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIwatch1);
        } else if (v.getId() == R.id.cardViewiwatch2) {
            int imageView = R.drawable.applewatchse;
            String text1 = "AppleWatch SE";
            String text2 = "Tampil dengan Sensor Cahaya Sekitar,Altimeter Always Active,Sensor Jantung Optik,dan GPS L1.";
            String text3 = "100% Berbahan Dasar Aluminium daur ulang !! !!!!";

            Intent BukaCvIwatch2 = new Intent(iWatchActivity.this, DetailActivity.class);

            BukaCvIwatch2.putExtra("Gambar", imageView);
            BukaCvIwatch2.putExtra("EXTRA_NAME1", text1);
            BukaCvIwatch2.putExtra("EXTRA_NAME2", text2);
            BukaCvIwatch2.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIwatch2);
        } else if (v.getId() == R.id.cardViewiwatch3) {
            int imageView = R.drawable.applewatchseries7;
            String text1 = "AppleWatch Series 7";
            String text2 = "Layar Jenis LTPO OLED,kecerahan 1000 Nit, memiliki Kaca Kristal dan fitur AppleWatch lainnya.";
            String text3 = "Menggunakan GPS GLONASS dengan Akselerometer !!";

            Intent BukaCvIwatch3 = new Intent(iWatchActivity.this, DetailActivity.class);

            BukaCvIwatch3.putExtra("Gambar", imageView);
            BukaCvIwatch3.putExtra("EXTRA_NAME1", text1);
            BukaCvIwatch3.putExtra("EXTRA_NAME2", text2);
            BukaCvIwatch3.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIwatch3);
        } else if (v.getId() == R.id.cardViewiwatch4) {
            int imageView = R.drawable.applewatchseries9;
            String text1 = "AppleWatch Series 9";
            String text2 = "Sensor Jantung Elektrik dan Tahan Debu dengan sertifikat IP6X, Sensor Oksigen Darah, Sensor Jantung Optik Gen 3";
            String text3 = "Tampil Edition dengan Warna Merah !!";

            Intent BukaCvIwatch4 = new Intent(iWatchActivity.this, DetailActivity.class);

            BukaCvIwatch4.putExtra("Gambar", imageView);
            BukaCvIwatch4.putExtra("EXTRA_NAME1", text1);
            BukaCvIwatch4.putExtra("EXTRA_NAME2", text2);
            BukaCvIwatch4.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIwatch4);
        } else if (v.getId() == R.id.cardViewiwatch5) {
            int imageView = R.drawable.applewatchultra2;
            String text1 = "AppleWatch Ultra 2 ";
            String text2 = "Apple Watch paling tangguh dan andal yang mendobrak batasan. Menghadirkan S9 SiP yang sepenuhnya baru. Sentuh Layar tanpa Menyentuhnya";
            String text3 = "Layar Produk Apple Paling Terang yang Pernah ada !!";

            Intent BukaCvIwatch5 = new Intent(iWatchActivity.this, DetailActivity.class);

            BukaCvIwatch5.putExtra("Gambar", imageView);
            BukaCvIwatch5.putExtra("EXTRA_NAME1", text1);
            BukaCvIwatch5.putExtra("EXTRA_NAME2", text2);
            BukaCvIwatch5.putExtra("EXTRA_NAME3", text3);
            startActivity(BukaCvIwatch5);
        }
    }
}