package com.example.tugaskeduapbergerak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView1 = findViewById(R.id.cardView1);
        CardView cardView2 = findViewById(R.id.cardView2);
        CardView cardView3 = findViewById(R.id.cardView3);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;

        //Tentukan Intent
            if (v.getId() == R.id.cardView1) {
                Intent CardViewPertama = new Intent(MainActivity.this, iphoneActivity.class);
                startActivity(CardViewPertama);
        } else if(v.getId() == R.id.cardView2) {
                Intent CardViewKedua = new Intent(MainActivity.this, iPadActivity.class);
                startActivity(CardViewKedua);
            } else if (v.getId() == R.id.cardView3) {
                Intent CardViewKetiga = new Intent(MainActivity.this, iWatchActivity.class);
                startActivity(CardViewKetiga);
            }
    }
}