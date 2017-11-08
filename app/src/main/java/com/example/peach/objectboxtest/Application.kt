package com.example.peach.objectboxtest

import android.app.Application
import android.content.Context
import io.objectbox.BoxStore

/**
 * Created by Peach on 2017/11/8.
 */
class Application : Application() {

    companion object {
        lateinit var boxStore:BoxStore
    }
    override fun onCreate() {
        super.onCreate()
        boxStore = MyObjectBox.builder().androidContext(this).build();
    }
}