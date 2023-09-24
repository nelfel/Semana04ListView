package com.example.del_ppt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var arrSO = arrayOf("Android", "Iphone","Windows phone", "Blackberry","Firefox OS","Amazon Word", "Nokia")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //SE obtinen el view lstSO
        val lsvSistemasOperativos: ListView = findViewById(R.id.lsvSO) as ListView
        val adaptador: Any? =
                ArrayAdapter<Any?>(this,android.R.layout.simple_dropdown_item_1line, arrSO)
        //Se asigna el adaptador a la view
        lsvSistemasOperativos.adapter = adaptador as ListAdapter?
        //Se genera el metodo setOnItemClickListener de la view

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(
                applicationContext, "Posicion: $position",
                Toast.LENGTH_SHORT
            ).show()

        }

    }
}