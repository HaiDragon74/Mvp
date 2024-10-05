package com.example.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),LoinInterface {
    override fun loginSuppress() {
        login.visibility=View.VISIBLE
        login.text="loginSuppress"

    }

    override fun loginError() {
        login.visibility=View.VISIBLE
        login.text="loginError"
    }

    private lateinit var buttonSignIn:Button
    private lateinit var textUsername:EditText
    private lateinit var textPassword:EditText
    private lateinit var login:TextView
    private var user:User?=null
    private lateinit var loginPresenter:LoginPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginPresenter= LoginPresenter(this)
        setContentView(R.layout.activity_main)
        buttonSignIn= findViewById(R.id.button_sign_in)
        textUsername= findViewById(R.id.text_username)
        textPassword= findViewById(R.id.text_password)
        login= findViewById(R.id.login)
        buttonSignIn.setOnClickListener {
            clickLogin()
        }
    }
    private fun clickLogin() {
        val textUsername=textUsername.text.toString()
        val textPassword=textPassword.text.toString()
        user=User(textUsername,textPassword)
        loginPresenter.login(user!!)
    }
}