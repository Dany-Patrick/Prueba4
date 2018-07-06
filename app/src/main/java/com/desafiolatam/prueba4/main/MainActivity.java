package com.desafiolatam.prueba4.main;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.desafiolatam.prueba4.R;
import com.desafiolatam.prueba4.models.Game;
import com.desafiolatam.prueba4.network.GetGameRandom;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new BackgroundGame().execute();
            }
        });
    }
    private class BackgroundGame extends GetGameRandom
    {
        private ProgressDialog progressDialog;
        @Override
        protected void onPreExecute() {
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setTitle("You are infected!.");
            progressDialog.show();


        }

        @Override
        protected void onPostExecute(List<Game> games) {
            try {
                if (games != null) {
                    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                    ArrayList<Game> arrayList = new ArrayList<>(games);
                    intent.putParcelableArrayListExtra("ARRAY", arrayList);
                    startActivity(intent);
                    MainActivity.this.finish();
                }
                progressDialog.dismiss();
            } catch (Exception e) {
                e.printStackTrace();
                Log.d("CATCH", e.getMessage());

            }
        }



    }


}
