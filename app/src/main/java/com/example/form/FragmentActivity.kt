package com.example.form

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.form.Fragment.FirstFragment
import com.example.form.Fragment.FourthFragment
import com.example.form.Fragment.SecondFragment
import com.example.form.Fragment.ThirdFragment

class FragmentActivity : AppCompatActivity() {
    lateinit var container : LinearLayout
    lateinit var  btn1 : Button
    lateinit var  btn2 : Button
    lateinit var  btn3 : Button
    lateinit var  btn4 : Button
    private val fragmentManager = supportFragmentManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        initview()
    }

    private fun initview() {

        container=findViewById(R.id.container)
        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        btn4=findViewById(R.id.btn4)

        btn1.setOnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, FirstFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }

        btn2.setOnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, SecondFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        btn3.setOnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, ThirdFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
        btn4.setOnClickListener {
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, FourthFragment())
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commit()
        }
    }
}