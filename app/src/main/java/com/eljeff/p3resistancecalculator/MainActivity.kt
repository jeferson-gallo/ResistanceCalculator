package com.eljeff.p3resistancecalculator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.eljeff.p3resistancecalculator.databinding.ActivityMainBinding

private const val SPACE = " "

class MainActivity : AppCompatActivity() {

    // Variable para declarar el ViewBinding
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater) // initialize ViewBinding
        setContentView(mainBinding.root)

        //Poner el icono en el action var
        //supportActionBar!!.setDisplayShowHomeEnabled(true)


        setupCustomSpinner() //Pendiente no se hacer

        mainBinding.bttCalculate.setOnClickListener {

            //************ Crear objeto para extraerle los atributos
            val colorDataObject =   ColorsData //Make object

            // *********** Capturar posiciones de los spinner
            val posDigit1: Int = mainBinding.spDigit1.selectedItemPosition
            val posDigit2: Int = mainBinding.spDigit2.selectedItemPosition
            val posPot: Int = mainBinding.spMult.selectedItemPosition
            val posTol: Int = mainBinding.spTol.selectedItemPosition

            // *********** Recuperar los atributos segun la posición
            val digit1 = colorDataObject.valuesDig1[posDigit1]
            val digit2 = colorDataObject.valuesDig2[posDigit2]
            val pot = colorDataObject.valuesPot[posPot]
            val dotBool = colorDataObject.valuesDot[posPot]
            val dot = if(dotBool) "." else ""
            val init = if (posPot == 11) "0." else ""
            val tol = colorDataObject.valuesTol[posTol]

            // Build result
            val result = init + digit1 + dot + digit2 + pot + tol
            val showResult : String = getString(R.string.result) + SPACE + result
            mainBinding.txvwResult.text = showResult


            //Log.d("Click", digit1 + SPACE + digit2 + SPACE + potencia + SPACE + tolerancia)

            //Log.d("Pos: ", posDigit1.toString())

        }
    }

    private fun setupCustomSpinner() {
        //Adaptador Digito 1
        val adapterDig1 = ColorsArrayAdapter(this, ColorsData.listDig1!!)
        //Adaptador Digito 2
        val adapterDig2 = ColorsArrayAdapter(this, ColorsData.listDig2!!)
        //Adaptador Potencia
        val adapterPot = ColorsArrayAdapter(this, ColorsData.listPot!!)
        //Adaptador Tolerancia
        val adapterTol = ColorsArrayAdapter(this, ColorsData.listTol!!)

        //Asignar los adaptadores al spinner
        mainBinding.spDigit1.adapter = adapterDig1
        mainBinding.spDigit2.adapter = adapterDig2
        mainBinding.spMult.adapter = adapterPot
        mainBinding.spTol.adapter = adapterTol

    }

}
