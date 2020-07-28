package com.example.actividadeslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_splash_.*

class Splash_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_)

     bt_ir_login.setOnClickListener { it: View? ->
         val intent = Intent(this, Registro_Activity::class.java)
         startActivity(intent)        }


     }

    }



