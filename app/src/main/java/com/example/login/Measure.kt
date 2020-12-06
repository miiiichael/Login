package com.example.login

import android.content.Intent
import android.os.Bundle
import android.text.GetChars
import android.widget.Button
import android.widget.EditText
import androidx.core.content.ContextCompat.startActivity

class HomeActivity AppCompatActivity(){
    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val height = findViewById<EditText>(R.id.edit_height)
        val weight = findViewById<EditText>(R.id.edit_weight)
        val btnNxt = findViewById<Button>(R.id.btn_nxt)


        btnNxt.setOnClickListener {
            if (height.text.filterIndexed(Int).equals(Int)&&
                    weight.text.filterIndexed(Int).equals(Int)) {
                val gotoNextActivity = Intent(this, MainActivity::class.java)
                startActivity(gotoNextActivity)
            }

    }

}