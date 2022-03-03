package com.example.git_hub_3

import android.util.Log

interface OnLog {

    fun onLog(TAG:String,a:String){
        Log.i(TAG,a )
    }
}