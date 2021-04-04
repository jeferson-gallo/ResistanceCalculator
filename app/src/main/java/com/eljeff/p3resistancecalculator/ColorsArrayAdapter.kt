package com.eljeff.p3resistancecalculator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.spinner_digits.view.*

class ColorsArrayAdapter (context: Context, colorsList: List<ColorDigits>) : ArrayAdapter<ColorDigits>(context, 0, colorsList)  {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup) : View {

        val color = getItem(position)

        val view = LayoutInflater.from(context).inflate(R.layout.spinner_digits, parent, false)

        view.imgvw_color.setImageResource(color!!.image)
        view.txvw_color_name.text = color.name

        return view

    }
}