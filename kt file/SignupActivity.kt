package com.example.studyforge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val buttonmain1 = findViewById<Button>(R.id.button)
        buttonmain1.setOnClickListener {
            val Intent = Intent(this, Third_Activity::class.java)
            startActivity(Intent)
        }
    }
}