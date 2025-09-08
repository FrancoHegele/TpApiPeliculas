package com.example.tppelisapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {


    lateinit var etUsuario : EditText
    lateinit var etContraseña : EditText
    lateinit var cbRecordarUsuario : CheckBox
    lateinit var btnIngresar : Button
    lateinit var btnRegistrarse : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    etUsuario = findViewById(R.id.editUsuario)
    etContraseña = findViewById(R.id.editContraseña)
    cbRecordarUsuario = findViewById(R.id.checkUsuario)
    btnIngresar = findViewById(R.id.btnIngresar)
    btnRegistrarse = findViewById(R.id.btnRegistrarse)

    btnRegistrarse.setOnClickListener {

        val intent = Intent(this, RegistroActivity::class.java)
        //intent.putExtra("Nombre: ", etUsuario.text.toString())
        startActivity(intent)
        finish()
    }


    validarLogin();


    }

    fun validarLogin(){


        if(etUsuario.text.toString().isEmpty() || etContraseña.text.toString().isEmpty()){

            Toast.makeText(this, "Completar datos", Toast.LENGTH_SHORT).show()
        } else {

            if(cbRecordarUsuario.isChecked)

                Log.i("TODO", "Funcionalidad de Recordar Usuario")

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("Nombre", etUsuario.text.toString())
            startActivity(intent)
            finish()
        }
    }


}