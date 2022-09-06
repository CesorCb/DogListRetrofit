package com.cesor.android.doglistprueba1

import com.google.gson.annotations.SerializedName

/****
 * Project: DogListPrueba1
 * From: com.cesor.android.doglistprueba1
 * Created by: César Castro on 5/09/2022 at 20:38.
 ***/
data class DogsResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>,
)
