package com.example.tppelisapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegistroActivity : AppCompatActivity() {

    lateinit var etNuevoUsuario : EditText
    lateinit var etNuevaContraseña : EditText
    lateinit var etConfirmarNuevaContraseña : EditText
    lateinit var cbTerminosCondiciones : CheckBox
    lateinit var btnNuevoRegistro : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etNuevoUsuario = findViewById(R.id.editNuevoUsuario)
        etNuevaContraseña = findViewById(R.id.editNuevaContraseña)
        etConfirmarNuevaContraseña = findViewById(R.id.editConfirmarContraseña)
        cbTerminosCondiciones = findViewById(R.id.cbTerminosCondiciones)
        btnNuevoRegistro = findViewById(R.id.btnNuevoRegistro)



        //registrarUsuario();

        btnNuevoRegistro.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            //intent.putExtra("Nombre: ", etUsuario.text.toString())
            startActivity(intent)
            finish()
        }

    }

    fun registrarUsuario() {

        if (etNuevoUsuario.text.toString().isEmpty() || etNuevaContraseña.text.toString()
                .isEmpty() || etConfirmarNuevaContraseña.text.toString().isEmpty()
        ) {

            Toast.makeText(this, "Completar datos", Toast.LENGTH_SHORT).show()
        } else {

            if (cbTerminosCondiciones.isChecked)

                Log.i("TODO", "Funcionalidad de Recordar Usuario")

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Nombre", etNuevoUsuario.text.toString())
            startActivity(intent)
            finish()
        }
    }



}