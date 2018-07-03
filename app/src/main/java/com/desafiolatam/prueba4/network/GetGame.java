package com.desafiolatam.prueba4.network;

import com.desafiolatam.prueba4.models.Game;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetGame {

    @GET("games/{number}")
    Call<List<Game>> getDefault(@Path("number") Integer number);
}