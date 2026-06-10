package com.example.exampracticum

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import android.widget.TextView
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

        //Btn SetOnClick Listeners
        btnAdd.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Add to Packing List")

            val input = EditText(this)
            input.hint = "Enter item name"
            builder.setView(input)


            builder.show()

            btnContinue.setOnClickListener {
                val intent = Intent(this, Display::class.java)
                intent.putStringArrayListExtra("packingList", packingList)
                startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}