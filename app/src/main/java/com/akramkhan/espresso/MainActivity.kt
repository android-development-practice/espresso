package com.akramkhan.espresso

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private lateinit var greetingView: TextView
    private lateinit var greetButton: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        greetingView = findViewById(R.id.greeting)
        greetButton = findViewById(R.id.greet_button)
    }

    fun greet(v: View) {
        supportActionBar?.title = "Hi World"
        greetButton.isEnabled = false
        greetingView.setText(R.string.hello)
    }
}
