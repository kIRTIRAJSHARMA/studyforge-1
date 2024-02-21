package com.example.studyforge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val buttonmath1 = findViewById<Button>(R.id.buttonmath1)
        buttonmath1.setOnClickListener {
            val Intent = Intent(this, Fourth_Activity::class.java)
            startActivity(Intent)
        }
        val buttonmath2 = findViewById<Button>(R.id.buttonmath2)
        buttonmath2.setOnClickListener {
            val Intent = Intent(this, FifthActivity::class.java)
            startActivity(Intent)
        }
        val buttonbee3 = findViewById<Button>(R.id.buttonbee3)
        buttonbee3.setOnClickListener {
            val Intent = Intent(this, SixthActivity::class.java)
            startActivity(Intent)
        }
        val buttonime4 = findViewById<Button>(R.id.buttonime4)
        buttonime4.setOnClickListener {
            val Intent = Intent(this, SeventhActivity::class.java)
            startActivity(Intent)
        }
        val buttoniee5 = findViewById<Button>(R.id.buttoniee5)
        buttoniee5.setOnClickListener {
            val Intent = Intent(this, Eighth_Activity::class.java)
            startActivity(Intent)
        }
        val buttonphysics6 = findViewById<Button>(R.id.buttonphysics6)
        buttonphysics6.setOnClickListener {
            val Intent = Intent(this, Ninth_Activity::class.java)
            startActivity(Intent)
        }
        val buttoncpro7 = findViewById<Button>(R.id.buttoncpro7)
        buttoncpro7.setOnClickListener {
            val Intent = Intent(this, Tenth_Activity::class.java)
            startActivity(Intent)
        }
        val buttondsa8 = findViewById<Button>(R.id.buttondsa8)
        buttondsa8.setOnClickListener {
            val Intent = Intent(this, Eleventh_Activity::class.java)
            startActivity(Intent)
        }
        val buttoncadglab9 = findViewById<Button>(R.id.buttoncadglab9)
        buttoncadglab9.setOnClickListener {
            val Intent = Intent(this, Twelth_Activity::class.java)
            startActivity(Intent)
        }
        val buttonieelab10 = findViewById<Button>(R.id.buttonieelab10)
        buttonieelab10.setOnClickListener {
            val Intent = Intent(this, Thirteenth_Activity::class.java)
            startActivity(Intent)
        }
        val buttonbeelab11 = findViewById<Button>(R.id.buttonbeelab11)
        buttonbeelab11.setOnClickListener {
            val Intent = Intent(this, Fouteen_Activity::class.java)
            startActivity(Intent)
        }
        val buttonphylab12 = findViewById<Button>(R.id.buttonphylab12)
        buttonphylab12.setOnClickListener {
            val Intent = Intent(this, Fifteen_Activity::class.java)
            startActivity(Intent)
        }

        }
}