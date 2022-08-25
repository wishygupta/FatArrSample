package com.example.lib1

import android.util.Log
import androidx.annotation.Keep
import com.example.lib2.Lib2

@Keep
class Lib1 {

    fun print() {
        Log.e("Printing","From lib1")
        Lib2().print()
    }
}