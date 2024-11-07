package com.example.pdm1_aula07_exemplo1_tlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.pdm1_aula07_exemplo1_tlogin.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}