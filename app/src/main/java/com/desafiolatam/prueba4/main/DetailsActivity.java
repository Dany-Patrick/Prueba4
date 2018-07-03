package com.desafiolatam.prueba4.main;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.desafiolatam.prueba4.R;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {
    public static final String MAIN = "com.desafiolatam.prueba4.main.KEY.MAIN";

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        setTitle(getIntent().getStringExtra(MAIN));

        ImageView imageView = findViewById(R.id.imageV);
        Picasso.get().load(getIntent().getStringExtra("url")).fit().centerCrop().into(imageView);
        TextView textViewSummary = findViewById(R.id.data2);
        textViewSummary.setText(getIntent().getStringExtra("summary"));


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(DetailsActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
