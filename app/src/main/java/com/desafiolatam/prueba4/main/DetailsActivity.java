package com.desafiolatam.prueba4.main;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.desafiolatam.prueba4.R;
import com.desafiolatam.prueba4.models.Game;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
try{
        ArrayList<Game> games = getIntent().getParcelableArrayListExtra("ARRAY");
     //   Toast.makeText(this, "LIST: " + games.get(0).getName(), Toast.LENGTH_SHORT).show();

        setTitle(games.get(0).getName());

        ImageView imageView = findViewById(R.id.imageV);

        TextView textViewSummary = findViewById(R.id.data);
        textViewSummary.setText(games.get(0).getSummary());
        String url = "https:"+games.get(0).getCover().getUrl();
        String urlFinal = url.replace("thumb","original");
        Picasso.get().load(urlFinal).fit().centerCrop().into(imageView);
        TextView textViewRating = findViewById(R.id.dataRating);
        textViewRating.setText("Popularidad del "+games.get(0).getTotal_rating()+"%");
    } catch (Exception e) {
        e.printStackTrace();
        Log.d("CATCH", e.getMessage());

    }

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(DetailsActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
