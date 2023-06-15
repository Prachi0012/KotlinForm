package com.example.form

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.form.databinding.ActivityMainBinding

class ProfileActivity : AppCompatActivity() {

    lateinit var uname: TextView
    lateinit var num: TextView
    lateinit var email: TextView
    lateinit var pass: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        initview()
    }

    private fun initview() {

        uname = findViewById<TextView>(R.id.uname)
        val name = intent.getStringExtra("NAME")
        uname.setText(name)
        num = findViewById<TextView>(R.id.num)
        val numb = intent.getStringExtra("NUM")
        num.setText(numb)
        email = findViewById<TextView>(R.id.email)
        val mail = intent.getStringExtra("EMAIL")
        email.setText(mail)
        pass = findViewById<TextView>(R.id.pass)
        val pas = intent.getStringExtra("PASSWORD")
        pass.setText(pas)


    }
}