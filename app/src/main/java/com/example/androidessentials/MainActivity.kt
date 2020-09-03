package com.example.androidessentials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBasic.setOnClickListener {
            val intent=Intent(this,BasicActivity::class.java)
            startActivity(intent)
        }

        btnRecyclerView.setOnClickListener {
            val intent=Intent(this,RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}