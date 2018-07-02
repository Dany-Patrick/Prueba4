package com.desafiolatam.prueba4.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.desafiolatam.prueba4.R;
import com.desafiolatam.prueba4.models.Game;
import com.desafiolatam.prueba4.network.GetGame;
import com.desafiolatam.prueba4.network.Interceptor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetGame getGame = new Interceptor().getBasic();
                getGame.getDefault().enqueue(new Callback<Game>() {
                    @Override
                    public void onResponse(Call<Game> call, Response<Game> response) {
                        Toast.makeText(MainActivity.this, response.body().getName(), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Game> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "mal", Toast.LENGTH_SHORT).show();

                    }
                    });


            }
        });
    }



}
