package com.example.gogledirectionmapapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("maps/api/directions/json")
    fun getDirection(
        @Query("mode") mode: String,
        @Query("transit_routing_preferance") preferance: String,
        @Query("origin") origin: String,
        @Query("destination") destination: String,
        @Query("key") key: String
    ):  Call<Result>

}