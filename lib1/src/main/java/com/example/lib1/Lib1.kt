package com.example.lib1

import com.example.lib2.Lib2

class Lib1 {

    fun print() {
        println("From lib1")
        Lib2().print()
    }
}