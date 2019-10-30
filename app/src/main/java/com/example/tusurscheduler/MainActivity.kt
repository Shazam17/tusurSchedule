package com.example.tusurscheduler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import okhttp3.Response
import okhttp3.ResponseBody

import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.http.GET
import java.util.*


interface Network{

    @GET("https://timetable.tusur.ru/faculties/fsu/groups/428-2.ics")
    fun downloadSchedule(): Call<retrofit2.Response<ResponseBody>>
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var network = Retrofit
            .Builder()
            //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(Network::class.java)


    }
}
