package com.ktlearn

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    //延迟申明var变量
    private lateinit var tvname: TextView
    private val msgList = listOf("123", "2", "3", "4")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvname.setOnClickListener {
            Toast.makeText(this, "这是一个", Toast.LENGTH_LONG).show()
            for (str in msgList) {
                Log.i(TAG, str)
            }
        }

    }
}