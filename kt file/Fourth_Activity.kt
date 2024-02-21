package com.example.studyforge

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studyforge.databinding.ActivityFourthBinding
import com.example.studyforge.databinding.ActivityMainBinding

class Fourth_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mathsyll01.setOnClickListener {
            openUrl("https://kirtirajsharma.github.io/STUDYFORGE/FILES/MATHEMATICS/UNIT1/Mathematics-I%20_Syllabus%20(1).pdf")
        }
    }
    private fun openUrl(link: String){
        val uri = Uri.parse(link)
        val inte = Intent (Intent.ACTION_VIEW, uri)

        startActivity(inte)
    }
}