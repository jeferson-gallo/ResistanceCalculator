package com.eljeff.p3resistancecalculator

data class ColorDigits(val image: Int, val name: String)

object ColorsData{

    private val images = intArrayOf(
        R.drawable.australia,
        R.drawable.brown_button_cut_bck,
        R.drawable.red_button_cut_bck,
        R.drawable.orange_button_cut_bck,
        R.drawable.yellow_button_cut_bck,
        R.drawable.green_button_cut_bck,
        R.drawable.blue_button_cut_bck,
        R.drawable.purple_button_cut_bck,
        R.drawable.gray_button_cut_bck,
        R.drawable.white_button_cut
    )

    private val names = arrayOf(
        "Black",
        R.string.brown.toString(),
        R.string.red.toString(),
        R.string.orange.toString(),
        R.string.yellow.toString(),
        R.string.green.toString(),
        R.string.blue.toString(),
        R.string.purple.toString(),
        R.string.gray.toString(),
        R.string.white.toString()
    )

    private val values = arrayOf(
        "1",
        "2"
    )

    var list: ArrayList<ColorDigits>? = null
        get(){
            if(field != null)
                return field

            field = ArrayList()
            for(i in images.indices){
                val imageId= images[i]
                val name_color : String = names[i]

                val color_dig = ColorDigits(imageId, name_color)

                field!!.add(color_dig)
            }
            return field
        }

}