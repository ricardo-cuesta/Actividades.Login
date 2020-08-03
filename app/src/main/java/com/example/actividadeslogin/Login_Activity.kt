package com.example.actividadeslogin

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class Login_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var datorecibidos = intent.extras
        var nombre = datorecibidos?.getString("nombre")
        var cedula = datorecibidos?.getLong("cedula")
        Toast.makeText(this, "nombre: $nombre  cedula: $cedula", Toast.LENGTH_SHORT).show()
        tv_verifica.text = nombre?.toString()

        bt_registro.setOnClickListener { it: View? ->
            onBackPressed()
        }

        bt_ingresar.setOnClickListener({
            //val name= dato_recibidos?.getString("nombre")
            val name = et_name_in.text.toString()
            val password = et_password_in.text.toString()
            tv_verifica.text = "nombre: $nombre   \nclave: $password \n  cedula:$cedula"


        })




    }



}