package com.example.instagram.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.instagram.R
import com.example.instagram.base.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener{
            val intent=Intent(this,DashboardActivity::class.java)
            startActivity(intent)

        }
    }
}