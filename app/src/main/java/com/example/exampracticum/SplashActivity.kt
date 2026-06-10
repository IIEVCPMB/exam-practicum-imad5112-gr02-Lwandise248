package com.example.exampracticum


import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import android.widget.TextView
//Declarations
    private lateinit var tvTitle: TextView
    private lateinit var SubTitle: TextView
    private lateinit var btnStart: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        //Typecasting

        tvTitle = findViewById(R.id.tvTitle)
        SubTitle = findViewById(R.id.SubTitle)
        btnStart =findViewById(R.id.btnStart)


}}
