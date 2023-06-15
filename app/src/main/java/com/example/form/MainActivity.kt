package com.example.form

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.form.databinding.ActivityMainBinding

abstract class MainActivity : AppCompatActivity() {
      lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    public fun initview() {
        binding.card.setOnClickListener {
            val name: String = binding.edtusename.text.toString()
            val num: String = binding.edtnum.text.toString()
            val email: String = binding.edtemail.text.toString()
            val password: String = binding.edtpassword.text.toString()
            val cpassword: String = binding.edtCpassword.text.toString()


            if(name.isEmpty()) {
                Toast.makeText(this, "Please enter User Name", Toast.LENGTH_SHORT).show()
            }
            else if(num.isEmpty()) {
                Toast.makeText(this, "Please enter Number", Toast.LENGTH_SHORT).show()
            }
            else if(email.isEmpty()) {
                Toast.makeText(this, "Please enter E-mail", Toast.LENGTH_SHORT).show()
            }
            else if(password.isEmpty()) {
                Toast.makeText(this, "Please enter Password", Toast.LENGTH_SHORT).show()
            }
            else if(password!=cpassword) {
                Toast.makeText(this, "Please enter same password", Toast.LENGTH_SHORT).show()
            }

            var intent = Intent(this,ProfileActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("NUM", num)
            intent.putExtra("EMAIL", email)
            intent.putExtra("PASSWORD", password)
            startActivity(intent)

        }
    }
}