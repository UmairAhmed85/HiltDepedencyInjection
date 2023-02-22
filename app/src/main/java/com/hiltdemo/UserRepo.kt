package com.hiltdemo

import android.util.Log
import javax.inject.Inject

class UserRepo @Inject constructor() {
    fun saveUser(email: String, password: String){
       println("Email: $email, Password:$password")
    }
}