package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var context: Context


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onClick(v: View?) {
        when(v?.id){


            //Toast.makeText(this,"make an application",Toast.LENGTH_LONG).show()
        }
    }
}