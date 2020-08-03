package com.example.actividadeslogin

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_registro.*
import java.text.SimpleDateFormat
import java.util.*
import java.util.Locale.US
import kotlinx.android.synthetic.main.activity_registro.tv_fecha_nacimiento as tv_fecha_nacimiento1

class Registro_Activity : AppCompatActivity() {
    private lateinit var date:String
    private var cal = Calendar.getInstance()





    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

       // val bt_aceptar : Button = findViewById(R.id.bt_aceptar)


        val dateSetListener= object :DatePickerDialog.OnDateSetListener
        {
            override fun onDateSet(view: DatePicker?, year: Int, month: Int, day: Int) {
                cal.set(Calendar.YEAR,year)
                cal.set(Calendar.MONTH,month)
                cal.set(Calendar.DAY_OF_MONTH,day)
                val format="dd/MM/yyyy"
                val simpleDateFormat=SimpleDateFormat(format, US)
                var fecha = simpleDateFormat.format(cal.time).toString()
                tv_fecha_nacimiento1.text=fecha
            }

        }
        ib_calendario.setOnClickListener {
            DatePickerDialog( this,
                dateSetListener,
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH)).show()
        }



        bt_aceptar.setOnClickListener{ it: View? ->

            val nombre = et_nombre.text.toString()
            val cedula = et_cedula.text.toString()
            val correo = et_correo.text.toString()
            val password =et_password.text.toString()
            var fecha :String = tv_fecha_nacimiento1.text.toString()
            val password_confirma=et_confirma_password.text.toString()


            if ((nombre!="")&&(cedula!="")&&(correo!="")&&(fecha!="")&&(password!="")){
                if (password ==password_confirma) {
                    tv_resumen.text =
                        "nombre: $nombre  \ndocumento:$cedula \ncorreo: $correo \nfecha de nacimiento: $fecha"
                    //  intent.putExtra("nombre", et_nombre.text.toString())

                }else{tv_resumen.text = "la contraseña no coincide $password"}
            }
        }

}

    override fun onCreateOptionsMenu(menu: Menu?): Boolean{
        menuInflater.inflate(R.menu.menu_overflow, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_actividad2) {
            tv_resumen.text = "axS"
            val intent: Intent = Intent(this, Login_Activity::class.java)
            val nombre = et_nombre.text.toString()
            val cedula = et_cedula.text.toString()

            intent.putExtra("nombre", et_nombre.text.toString())
            intent.putExtra("cedula", et_cedula.text.toString().toLong())
            Toast.makeText(this, "nombre: $nombre  cedula: $cedula", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }
        if (item.itemId == R.id.menu_actividad3) {
            tv_resumen.text = "axS"
            val intent: Intent = Intent(this, Splash_Activity::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    fun OnCalendarButtonClicked(view: View) {}


}