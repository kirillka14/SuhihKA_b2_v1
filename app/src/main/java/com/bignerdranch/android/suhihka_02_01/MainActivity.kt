package com.bignerdranch.android.suhihka_02_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import android.content.SharedPreferences as SharedPreferences1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun GoToSecondActivity(view: View)
    {
       if (R.id.editTextTextPersonName != null && R.id.editTextTextPersonName2 !=null)
       {
            fun(savedInstanceState: Bundle?){
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_second)
            }

       }
        else
       {
           AlertDialog()
       }
    }

    private fun AlertDialog() {
        TODO("Введите логин и пароль")
    }


}