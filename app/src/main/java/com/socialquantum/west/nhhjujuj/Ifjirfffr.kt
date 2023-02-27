package com.socialquantum.west.nhhjujuj

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.socialquantum.west.bghyhyhy.Njkfjrrfjffr
import com.socialquantum.west.bghyjujuju.UHFrhfhrhuuhfhrf
import com.socialquantum.west.bnhjujuuj.HIDfueihfrhrfurffhf
import com.socialquantum.west.bnhnhjuujju.Fhurhrfhurfhurfrfrf
import com.socialquantum.west.gtjgtijgtgt.NJnfdrfrfrf
import com.socialquantum.west.njjuikkiik.Gygfrgygrfrfrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun hyhy5hy59hy5(): Gson {
    return GsonBuilder().create()
}



val bgbgnhhy5995uj5ju = module {
    viewModel (named("MainModel")){
        NJnfdrfrfrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Gygfrgygrfrfrf(get())
    }
}

val hhy5hy595hy95hy = module {

    single  <UHFrhfhrhuuhfhrf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(UHFrhfhrhuuhfhrf::class.java)
    }

    single <Njkfjrrfjffr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Njkfjrrfjffr::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://scarletdestiny.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Fhurhrfhurfhurfrfrf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        HIDfueihfrhrfurffhf(get(named("HostInter")))
    }
    single{
        hyhy5hy59hy5()
    }
    single (named("SharedPreferences")) {
        h26hyhyhy6(androidApplication())
    }
}

fun h26hyhyhy6(hg5hy5hyh5yhy5hy: Application): SharedPreferences {
    return hg5hy5hyh5yhy5hy.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


