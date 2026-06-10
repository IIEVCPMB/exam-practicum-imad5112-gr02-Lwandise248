package com.example.exampracticum

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //Declarations
    private lateinit var tvTitle: TextView
    private lateinit var btnContinue: Button
    private lateinit var btnAdd: Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    //Typecasting
        tvTitle = findViewById(R.id.tvTitle)
        btnAdd = findViewById(R.id.btnAdd)
        btnContinue = findViewById(R.id.btnContinue)

        


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}