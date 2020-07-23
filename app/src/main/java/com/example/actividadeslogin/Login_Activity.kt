package com.example.actividadeslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        bt_splash.setOnClickListener {
            val intent = Intent(this, Splash_Activity::class.java)
            startActivity(intent)
        }
        bt_registro.setOnClickListener {
            val intent = Intent(this, Registro_Activity::class.java)
            startActivity(intent)

        }


    }
}