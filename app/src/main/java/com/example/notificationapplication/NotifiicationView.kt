package com.example.notificationapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NotifiicationView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifiication_view)

        val textView = findViewById<TextView>(R.id.textView)
        val message : String? = intent.getStringExtra("message")
        textView.setText(message)
    }
}