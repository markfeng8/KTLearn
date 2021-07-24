package com.ktlearn

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvName: TextView = findViewById(R.id.tv_name)

        tvName.setOnClickListener {
            toast(this,"tishi").show()
        }

    }

    fun toast(context: Context, msg: String):Toast = Toast.makeText(context, msg, Toast.LENGTH_LONG)
}