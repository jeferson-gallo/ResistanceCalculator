package com.eljeff.p3resistancecalculator

data class ColorDigits(val image: Int, val name: String)

private const val brown = "Marrón"
private const val black = "Negro"
private const val red = "Rojo"
private const val orange = "Naranja"
private const val yellow = "Amarillo"
private const val green = "Verde"
private const val blue = "Azúl"
private const val purple = "Violeta"
private const val gray = "Gris"
private const val white = "Blanco"
private const val gold = "Dorado"
private const val silver = "Plateado"

object ColorsData{

    //***************************** Atributos del spinner Digito 1 *********************************
    private val imagesDig1 = intArrayOf(
        R.drawable.brown_button,
        R.drawable.red_button,
        R.drawable.orange_button,
        R.drawable.yellow_button,
        R.drawable.green_button,
        R.drawable.blue_button,
        R.drawable.purple_button,
        R.drawable.gray_button,
        R.drawable.white_button
    )

    private val namesDig1 = arrayOf(
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        purple,
        gray,
        white
    )
    val valuesDig1 = arrayOf(
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9"
    )
    var listDig1: ArrayList<ColorDigits>? = null
        get(){
            if(field != null)
                return field

            field = ArrayList()
            for(i in imagesDig1.indices){
                val imageId= imagesDig1[i]
                val nameColor : String = namesDig1[i]

                val colorDig = ColorDigits(imageId, nameColor)

                field!!.add(colorDig)
            }
            return field
        }

    //***************************** Atributos del spinner Digito 2 *******************************

    private val imagesDig2 = intArrayOf(
        R.drawable.black_button,
        R.drawable.brown_button,
        R.drawable.red_button,
        R.drawable.orange_button,
        R.drawable.yellow_button,
        R.drawable.green_button,
        R.drawable.blue_button,
        R.drawable.purple_button,
        R.drawable.gray_button,
        R.drawable.white_button
    )

    private val namesDig2 = arrayOf(
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        purple,
        gray,
        white
    )
    val valuesDig2 = arrayOf(
        "0",
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9"
    )
    var listDig2: ArrayList<ColorDigits>? = null
        get(){
            if(field != null)
                return field

            field = ArrayList()
            for(i in imagesDig2.indices){
                val imageId= imagesDig2[i]
                val nameColor : String = namesDig2[i]

                val colorDig = ColorDigits(imageId, nameColor)

                field!!.add(colorDig)
            }
            return field
        }

    //***************************** Atributos del spinner Potencia *******************************

    private val imagesPot = intArrayOf(
        R.drawable.black_button,
        R.drawable.brown_button,
        R.drawable.red_button,
        R.drawable.orange_button,
        R.drawable.yellow_button,
        R.drawable.green_button,
        R.drawable.blue_button,
        R.drawable.purple_button,
        R.drawable.gray_button,
        R.drawable.white_button,
        R.drawable.gold_button,
        R.drawable.silver_button
    )

    private val namesPot = arrayOf(
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        purple,
        gray,
        white,
        gold,
        silver
    )
    val valuesPot = arrayOf(
        " ohm",
        "0 ohm",
        "K ohm",
        "K ohm",
        "0K ohm",
        "M ohm",
        "M ohm",
        "0M ohm",
        "G ohm",
        "G ohm",
        " ohm",
        " ohm"
    )
    val valuesDot = arrayOf(
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        false,
        true,
        false,
        true,
        false
    )

    var listPot: ArrayList<ColorDigits>? = null
        get(){
            if(field != null)
                return field

            field = ArrayList()
            for(i in imagesPot.indices){
                val imageId= imagesPot[i]
                val nameColor : String = namesPot[i]

                val colorDig = ColorDigits(imageId, nameColor)

                field!!.add(colorDig)
            }
            return field
        }
    //***************************** Atributos del spinner Tolerancia *****************************

    private val imagesTol = intArrayOf(
        R.drawable.brown_button,
        R.drawable.red_button,
        R.drawable.green_button,
        R.drawable.blue_button,
        R.drawable.purple_button,
        R.drawable.gray_button,
        R.drawable.gold_button,
        R.drawable.silver_button
    )

    private val namesTol = arrayOf(
        brown,
        red,
        green,
        blue,
        purple,
        gray,
        gold,
        silver
    )
    val valuesTol = arrayOf(
        " (+-) 1 %",
        " (+-) 2 %",
        " (+-) 0.5 %",
        " (+-) 0.25 %",
        " (+-) 0.1 %",
        " (+-) 0.05 %",
        " (+-) 5 %",
        " (+-) 10 %"
    )

    var listTol: ArrayList<ColorDigits>? = null
        get(){
            if(field != null)
                return field

            field = ArrayList()
            for(i in imagesTol.indices){
                val imageId= imagesTol[i]
                val nameColor : String = namesTol[i]

                val colorDig = ColorDigits(imageId, nameColor)

                field!!.add(colorDig)
            }
            return field
        }
}