package com.example.summerpractice

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val emailTextView = findViewById<TextView>(R.id.emailTextView)
        val passwordTextView = findViewById<TextView>(R.id.passwordTextView)

        val email = intent.getStringExtra("EMAIL") ?: ""
        val password = intent.getStringExtra("PASSWORD") ?: ""

        emailTextView.text = "Email: $email"
        passwordTextView.text = "Пароль: $password"
    }
}