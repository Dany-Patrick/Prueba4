package com.desafiolatam.prueba4.network;

import android.os.AsyncTask;

import com.desafiolatam.prueba4.models.Game;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import retrofit2.Response;

public class GetGameRandom  extends AsyncTask<Void, Void,List<Game>> {
        @Override
        protected List<Game> doInBackground(Void... voids) {
            final List<Integer> numbers = Arrays.asList(19686, 880,974,424,1082,24869,847,15108,55163,19562,24369,968,966,969,970,977,978,7725,971);

            GetGame getGame = new Interceptor().getBasic();
            int numberRandom = (int) (Math.random() *19) ;
            retrofit2.Call<List<Game>> gameCall = getGame.getDefault(numbers.get(numberRandom));

            try {
                Response<List<Game>> response = gameCall.execute();
                if(200 == response.code() && response.isSuccessful())
                {
                    return response.body();
                }else
                {
                    return null;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }


        }
    }
