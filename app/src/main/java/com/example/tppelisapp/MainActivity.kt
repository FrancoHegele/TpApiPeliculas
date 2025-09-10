package com.example.tppelisapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btnElConjuro4 : Button
    lateinit var btnGladiadorII : Button
    lateinit var btnHomoArgentum : Button
    lateinit var btnDestinoFinal6 : Button
    lateinit var btnLosCuatroFantasticos : Button
    lateinit var btnOtroViernesDeLocos : Button
    lateinit var tvElConjuro4 : TextView
    lateinit var tvGladiadorII : TextView
    lateinit var tvHomoArgentum : TextView
    lateinit var tvDestinoFinal : TextView
    lateinit var tvLosCuatroFantasticos : TextView
    lateinit var tvOtroViernesDeLocos : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        btnElConjuro4 = findViewById(R.id.elConjuro4)
        btnGladiadorII = findViewById(R.id.gladiadorII)
        btnHomoArgentum = findViewById(R.id.homoArgentum)
        btnDestinoFinal6 = findViewById(R.id.destinoFinal)
        btnLosCuatroFantasticos = findViewById(R.id.losCuatroFantasticos)
        btnOtroViernesDeLocos = findViewById(R.id.otroViernesDeLocos)
        tvElConjuro4 = findViewById(R.id.infoElConjuro)
        tvGladiadorII = findViewById(R.id.infoGladiadorII)
        tvHomoArgentum = findViewById(R.id.infoHomoArgentum)
        tvDestinoFinal = findViewById(R.id.infoDestinoFinal)
        tvLosCuatroFantasticos = findViewById(R.id.infoLosCuatroFantasticos)
        tvOtroViernesDeLocos = findViewById(R.id.infoOtroViernesDeLocos)


        btnElConjuro4.setOnClickListener() {

           if(tvElConjuro4.visibility == View.GONE){

               tvElConjuro4.visibility = View.VISIBLE
           }else{

               tvElConjuro4.visibility = View.GONE
           }
        }


        btnGladiadorII.setOnClickListener() {

            if(tvGladiadorII.visibility == View.GONE){

                tvGladiadorII.visibility = View.VISIBLE
            }else{

                tvGladiadorII.visibility = View.GONE
            }
        }


        btnHomoArgentum.setOnClickListener() {

            if(tvHomoArgentum.visibility == View.GONE){

                tvHomoArgentum.visibility = View.VISIBLE
            }else{

                tvHomoArgentum.visibility = View.GONE
            }
        }


        btnDestinoFinal6.setOnClickListener() {

            if(tvDestinoFinal.visibility == View.GONE){

                tvDestinoFinal.visibility = View.VISIBLE
            }else{

                tvDestinoFinal.visibility = View.GONE
            }
        }


        btnLosCuatroFantasticos.setOnClickListener() {

            if(tvLosCuatroFantasticos.visibility == View.GONE){

                tvLosCuatroFantasticos.visibility = View.VISIBLE
            }else{

                tvLosCuatroFantasticos.visibility = View.GONE
            }
        }


        btnOtroViernesDeLocos.setOnClickListener() {

            if(tvOtroViernesDeLocos.visibility == View.GONE){

                tvOtroViernesDeLocos.visibility = View.VISIBLE
            }else{

                tvOtroViernesDeLocos.visibility = View.GONE
            }
        }


    }


}