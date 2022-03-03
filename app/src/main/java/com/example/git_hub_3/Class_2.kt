package com.example.git_hub_3

import android.util.Log

class Class_2 (var a:String):OnLog {

    fun init(){
        var TAG=javaClass.simpleName
        var a=System.currentTimeMillis().toString()
        onLog(TAG,a)
        Class_4()
    }

    fun onLog(){
        Log.i("Class_2"," "+a )
    }

}