package com.example.mvp

import android.text.TextUtils
import android.util.Patterns

class User(val email:String, val passWork:String) {
    fun checkEmail():Boolean{
        return TextUtils.isEmpty(email) || Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
    fun checkPassWork():Boolean{
        return TextUtils.isEmpty(passWork) || passWork.length>=6
    }
}