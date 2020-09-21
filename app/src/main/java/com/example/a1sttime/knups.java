package com.example.a1sttime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class knups extends AppCompatActivity implements View.OnClickListener {

    Button knup1, knup2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.knupstuff);

        knup1 = findViewById(R.id.knup1);
        knup2 = findViewById(R.id.knup2);

        knup1.setOnClickListener(this);
        knup2.setOnClickListener(this);
    }

    public void onClick(View hallo) {

        if (hallo == knup1) {

            knup1.setText("yessir ok");

            Intent intent = new Intent(this, knups2.class);
            this.startActivity(intent);

        }
        else if (hallo == knup2) {

            knup2.setText("o shit wrong number");

            ImageView atpCap = findViewById(R.id.imageView);
            atpCap.setImageResource(R.drawable.lobsters);
        }
    }



}