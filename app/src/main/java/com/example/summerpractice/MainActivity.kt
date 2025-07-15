package com.example.summerpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    private val picturesList = listOf(
        R.drawable.danya,
        R.drawable.ainaz,
        R.drawable.ars,
        R.drawable.attractiveguy,
        R.drawable.gays,
        R.drawable.sam1k,
        R.drawable.guys,
        R.drawable.fanzilych,
        R.drawable.lol,
        R.drawable.top
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val randomImageButton = findViewById<Button>(R.id.randomImageButton)
        val goToSecondScreenButton = findViewById<Button>(R.id.goToSecondScreenButton)

        randomImageButton.setOnClickListener {
            val randomIndex = (0 until picturesList.size).random()
            Glide.with(this)
                .load(picturesList[randomIndex])
                .into(imageView)
        }

        goToSecondScreenButton.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}