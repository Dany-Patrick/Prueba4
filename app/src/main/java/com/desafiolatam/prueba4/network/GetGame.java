package com.desafiolatam.prueba4.network;

import com.desafiolatam.prueba4.models.Game;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetGame {

    @GET("973")
    Call<Game> getDefault();
}