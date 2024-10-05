package com.example.mvp

class LoginPresenter(private val loinInterface: LoinInterface):LoinInterface.LoginInterface {

    override fun login(user: User) {
        if (user.checkEmail() && user.checkPassWork()){
            loinInterface.loginSuppress()
        }else{
            loinInterface.loginError()
        }
    }
}