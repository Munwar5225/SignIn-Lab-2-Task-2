package com.example.loginsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var login:Button = findViewById(R.id.login)
        var Password:EditText  = findViewById(R.id.password)
        val user = "munwar5225"
        val password =  "5225"
        val username:EditText = findViewById(R.id.username)
        val textView : TextView  = findViewById(R.id.wecome)
        textView.visibility  = View.INVISIBLE
        login.setOnClickListener {
        if (username.text.toString() == user && Password.text.toString() == password){
            Toast.makeText(this, "Logged in", Toast.LENGTH_LONG).show()
            Password.visibility = View.INVISIBLE
            username.visibility = View.INVISIBLE
            textView.visibility = View.VISIBLE
            login.visibility = View.INVISIBLE


        }
            else
        {
            Toast.makeText(this, "Error!  try username = munware5225, pasword  = 5225", Toast.LENGTH_LONG).show()
        }
        }
    }
}