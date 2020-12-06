package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.GetChars
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val height = findViewById<EditText>(R.id.edit_height)
        val weight = findViewById<EditText>(R.id.edit_weight)
        val btnNxt = findViewById<Button>(R.id.btn_nxt)


        btnNxt.setOnClickListener {
            if (height.text.filterIndexed(Int).equals(Int)&&
                    weight.text.filterIndexed(Int).equals(Int)) {
                val gotoNextActivity = Intent(this, NextActivity::class.java)
                startActivity(gotoNextActivity)
            }
        }
    }
}

private fun GetChars.filterIndexed(int: Int.Companion) {

}


