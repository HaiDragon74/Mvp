package com.example.mvp


//dinh nghia cac ham giao tiep vs loginpresenter
interface LoinInterface {
    fun loginSuppress()
    fun loginError()
    interface LoginInterface{
        fun login(user: User)
    }
}