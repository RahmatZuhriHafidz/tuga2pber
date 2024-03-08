package com.example.tugaskeduapbergerak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView imageView;

    private TextView tvTitle, tvDesc, tvFinal;

    public static final String EXTRA_NAME1 ="EXTRA_NAME1";
    public static final String EXTRA_NAME2 ="EXTRA_NAME2";
    public static final String EXTRA_NAME3 ="EXTRA_NAME3";
    public static final String EXTRA_NAME4 ="EXTRA_NAME4";
    public static final String EXTRA_NAME5 ="EXTRA_NAME5";
    public static final String EXTRA_NAME6 ="EXTRA_NAME6";

    private CardView cardViewiphone1, cardViewiphone2, cardViewiphone3, cardViewiphone4, cardViewiphone5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.imageView);
        tvTitle = findViewById(R.id.tvTittle);
        tvDesc = findViewById(R.id.tvDesc);
        tvFinal = findViewById(R.id.tvFinal);

        String kirimanData1 = getIntent().getStringExtra(EXTRA_NAME1);
        String kirimanData2 = getIntent().getStringExtra(EXTRA_NAME2);
        String kirimanData3 = getIntent().getStringExtra(EXTRA_NAME3);
        Intent intent = getIntent();
        int imageView = intent.getIntExtra("Gambar",0);

        tvTitle.setText(kirimanData1);
        tvDesc.setText(kirimanData2);
        tvFinal.setText(kirimanData3);

    }
}
