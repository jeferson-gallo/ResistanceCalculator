package com.eljeff.p3resistancecalculator

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.eljeff.p3resistancecalculator.databinding.ActivityMainBinding

private const val SPACE = " "

class MainActivity : AppCompatActivity() {

    // Variable para declarar el ViewBinding
    private lateinit var mainBinding: ActivityMainBinding


    //************* Variables para hacer respuesta ****************
    private var item1: String = ""
    private var item2: String = ""
    private var pot: String = ""
    private var tol: String = ""
    private var dot: String = ""
    private var init: String = ""
    private var result: String = ""

    //*************************************************************


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater) // initialize ViewBinding
        setContentView(mainBinding.root)

        //setupCustomSpinner() //Pendiente no se hacer

        mainBinding.bttCalculate.setOnClickListener {

            // Capturar los datos de los spiner
            val digit1 = mainBinding.spDigit1.selectedItem.toString()
            val digit2 = mainBinding.spDigit2.selectedItem.toString()
            val potencia = mainBinding.spMult.selectedItem.toString()
            val tolerancia = mainBinding.spTol.selectedItem.toString()

            // Extraer valor del item
            calculateDigit1(digit1)
            calculateDigit2(digit2)
            calculatePot(potencia)
            calculateTol(tolerancia)

            // Build result
            result = init + item1 + dot + item2 + pot + tol
            val showResult : String = getString(R.string.result) + SPACE + result
            mainBinding.txvwResult.text = showResult

            Log.d("Click", digit1 + SPACE + digit2 + SPACE + potencia + SPACE + tolerancia)

            Log.d("Result: ", result)

        }
    }

    private fun calculateTol(tolerancia: String){

        when (tolerancia) {
            getString(R.string.brown) ->
                tol = " (+-) 1 %"
            getString(R.string.red) ->
                tol = " (+-) 2 %"
            getString(R.string.green) ->
                tol = " (+-) 0.5 %"
            getString(R.string.blue) ->
                tol = " (+-) 0.25 %"
            getString(R.string.purple) ->
                tol = " (+-) 0.1 %"
            getString(R.string.gray) ->
                tol = " (+-) 0.05 %"
            getString(R.string.gold) ->
                tol = " (+-) 5 %"
            getString(R.string.silver) ->
                tol = " (+-) 10 %"
        }
    }

    private fun calculatePot(potencia: String){

        when (potencia) {
            getString(R.string.black) -> {
                pot = " ohm"
                dot = ""
                init =  ""
            }
            getString(R.string.brown) ->{
                pot = "0 ohm"
                dot = ""
                init =  ""
            }
            getString(R.string.red) -> {
                pot = "K ohm"
                dot = "."
                init =  ""
            }
            getString(R.string.orange) ->{
                pot = "K ohm"
                dot = ""
                init =  ""
            }
            getString(R.string.yellow) ->{
                pot = "0K ohm"
                dot = ""
                init =  ""
            }
            getString(R.string.green) ->{
                pot = "M ohm"
                dot = "."
                init =  ""
            }
            getString(R.string.blue) ->{
                pot = "M ohm"
                dot = ""
                init =  ""
            }
            getString(R.string.purple) ->{
                pot = "0M ohm"
                dot = ""
                init =  ""
            }
            getString(R.string.gray) ->{
                pot = "G ohm"
                dot = "."
                init =  ""
            }
            getString(R.string.white) ->{
                pot = "G ohm"
                dot = ""
                init =  ""
            }
            getString(R.string.gold) ->{
                pot = " ohm"
                dot = "."
                init =  ""
            }
            getString(R.string.silver) ->{
                pot = " ohm"
                dot = ""
                init =  "0."
            }
        }
    }

    private fun calculateDigit2(digit2: String){
        when (digit2) {
            getString(R.string.black) ->
                item2 = "0"
            getString(R.string.brown) ->
                item2 = "1"
            getString(R.string.red) ->
                item2 = "2"
            getString(R.string.orange) ->
                item2 = "3"
            getString(R.string.yellow) ->
                item2 = "4"
            getString(R.string.green) ->
                item2 = "5"
            getString(R.string.blue) ->
                item2 = "6"
            getString(R.string.purple) ->
                item2 = "7"
            getString(R.string.gray) ->
                item2 = "8"
            getString(R.string.white) ->
                item2 = "9"
        }
    }

    private fun calculateDigit1(digit1: String){
        when (digit1) {
            getString(R.string.brown) ->
                item1 = "1"
            getString(R.string.red) ->
                item1 = "2"
            getString(R.string.orange) ->
                item1 = "3"
            getString(R.string.yellow) ->
                item1 = "4"
            getString(R.string.green) ->
                item1 = "5"
            getString(R.string.blue) ->
                item1 = "6"
            getString(R.string.purple) ->
                item1 = "7"
            getString(R.string.gray) ->
                item1 = "8"
            getString(R.string.white) ->
                item1 = "9"
        }
    }
}
