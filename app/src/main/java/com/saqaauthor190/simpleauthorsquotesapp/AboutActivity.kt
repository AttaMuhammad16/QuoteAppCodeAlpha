package com.saqaauthor190.simpleauthorsquotesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        window.statusBarColor=ContextCompat.getColor(this,R.color.teal_200)
    }
}