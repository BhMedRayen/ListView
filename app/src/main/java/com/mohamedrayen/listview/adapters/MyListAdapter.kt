package com.mohamedrayen.listview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.mohamedrayen.listview.Person.Person
import com.mohamedrayen.listview.R

class MyListAdapter(var mCtx:Context,var resource:Int,var items:List<Person>)
    : ArrayAdapter<Person>(mCtx,resource,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater : LayoutInflater = LayoutInflater.from(mCtx)
        val view : View = layoutInflater.inflate(resource,null)
        val imageView =view.findViewById<ImageView>(R.id.imageView)
        val textView =view.findViewById<TextView>(R.id.textView)
        val textView2=view.findViewById<TextView>(R.id.textView2)
        var person : Person = items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(person.image))
        textView.text = person.name
        textView2.text=person.description
        view?.setOnClickListener(){
            Toast.makeText(mCtx,  "this is "+person.name, Toast.LENGTH_SHORT).show()
        }
        return view
    }
}