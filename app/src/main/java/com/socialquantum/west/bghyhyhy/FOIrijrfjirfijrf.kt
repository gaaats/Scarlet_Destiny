package com.socialquantum.west.bghyhyhy

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import com.socialquantum.west.bghyhyhjjuju.JIFjijifrrfrf
import retrofit2.Response
import retrofit2.http.GET

@Keep
data class Njfoirjrfjfrji(
    @SerializedName("domusgeo")
    val domusgeo: String,
    @SerializedName("domusview")
    val domusview: String,
    @SerializedName("domusnumber")
    val domusnumber: String,
)

interface Njkfjrrfjffr {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun gtpkgtkpkopgt(): Response<JIFjijifrrfrf>
}








