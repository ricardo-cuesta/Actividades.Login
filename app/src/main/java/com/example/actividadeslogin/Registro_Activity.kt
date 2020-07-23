package com.example.actividadeslogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_registro.*

class Registro_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

       // val bt_aceptar : Button = findViewById(R.id.bt_aceptar)

        bt_aceptar.setOnClickListener{

            val nombre =et_nombre.text.toString()
            val cedula =et_cedula.text.toString()
            val correo = et_correo.text.toString()


            tv_resumen.text="nombre: $nombre  \ndocumento:$cedula \ncorreo: $correo \n "


        }


}

    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.menu_actividad2){
           tv_resumen.text ="axS"
            val intent : Intent=Intent(this, Login_Activity::class.java)
            startActivity(intent)        }
        if (item.itemId==R.id.menu_actividad3){
            tv_resumen.text ="axS"
            val intent : Intent=Intent(this, Splash_Activity::class.java)
            startActivity(intent)        }
        return super.onOptionsItemSelected(item)
    }


}