package com.example.android.dagger.test

class CustomData {
    private var name = "hi"

    fun changeName(){
        name = "a_change"
    }

    fun getName(): String {
        return name
    }
}