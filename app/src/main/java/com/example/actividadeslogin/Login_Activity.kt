package com.example.actividadeslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_registro.*

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    bt_registro.setOnClickListener {it: View? ->
        val intent = Intent(this, Registro_Activity::class.java)
        startActivity(intent)    }

        bt_ingresar.setOnClickListener({
            val name = et_name_in.text.toString()
            val password = et_password_in.text.toString()
            tv_verifica.text = "nombre: $name   \nclave: $password \n "

        })




    }



}