package com.mohetabsem.androidfiles

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.row.view.*


class MyCostomAdapter(context: Context,var names:ArrayList<String>):
    ArrayAdapter<String>(context,0, names) {
     override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view= LayoutInflater.from(context).inflate(R.layout.row,parent,false)
         var item=""

         view.name.text=names[position]
         return view
    }


}