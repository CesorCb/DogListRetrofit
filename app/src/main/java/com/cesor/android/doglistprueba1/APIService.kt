package com.cesor.android.doglistprueba1

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

/****
 * Project: DogListPrueba1
 * From: com.cesor.android.doglistprueba1
 * Created by: César Castro on 5/09/2022 at 20:43.
 ***/
interface APIService {
    @GET
    suspend fun getDogsByBreed(@Url url: String): Response<DogsResponse>
}