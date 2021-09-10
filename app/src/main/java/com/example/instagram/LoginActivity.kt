package com.example.instagram

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity:AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val auth=FirebaseAuth.getInstance()
        if(auth.currentUser!=null){
             val intent=Intent(this, MainActivity::class.java)
             startActivity(intent)
        }

        btnLogin.setOnClickListener{
           // val intent=Intent(this, MainActivity::class.java)
           // startActivity(intent)

            val email=etEmail.text.toString()
            val password=etPassword.text.toString()

            if(email.isEmpty()|| password.isEmpty()){
                Toast.makeText(this,"Email/Password can be empty",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            auth.signInWithEmailAndPassword(email,password).addOnCompleteListener { task->
                if(task.isSuccessful) {
                    Toast.makeText(this, "Successful", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()

                }
            }

        }
    }


}