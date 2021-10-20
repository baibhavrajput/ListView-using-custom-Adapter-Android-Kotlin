package com.example.listviewscustomadapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(private val context: Activity, private val name: Array<String>, private val roll: Array<String>, private val imageId: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.activity_list_items, name) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {

        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_list_items,null,true)

        val nameText = rowView.findViewById(R.id.tv_name) as TextView
        val rollText = rowView.findViewById(R.id.tv_roll) as TextView
        val dpImage = rowView.findViewById(R.id.iv_dp) as ImageView

        nameText.text = name[position]
        rollText.text = roll[position]
        dpImage.setImageResource(imageId[position])

        return rowView

    }
    }
