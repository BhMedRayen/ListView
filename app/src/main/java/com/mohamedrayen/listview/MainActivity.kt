package com.mohamedrayen.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.mohamedrayen.listview.Person.Person
import com.mohamedrayen.listview.adapters.MyListAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listview = findViewById<ListView>(R.id.listview1)
        val lisi = mutableListOf<Person>()
        lisi.add(Person("Moha", "full stack web mobile devlopper", R.drawable.me))
        lisi.add(Person("Mohamed", "full stack web mobile devlopper", R.drawable.rinou2))
        lisi.add(Person("Rayen", "full stack web mobile devlopper", R.drawable.rinou))
        lisi.add(Person("Rinou", "full stack web mobile devlopper", R.drawable.rayen))
        listview.adapter = MyListAdapter(this, R.layout.list_item, lisi)
//        listview.setOnItemClickListener { parent, view, position, id ->
//            if (position == 0) {
//                Toast.makeText(this, "This is moha", Toast.LENGTH_SHORT).show()
//            } else if (position == 1) {
//                Toast.makeText(this, "This is Mohamed", Toast.LENGTH_SHORT).show()
//            } else if (position == 2) {
//                Toast.makeText(this, "This is Rayen", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(this, "This is Rinou", Toast.LENGTH_SHORT).show()
//            }
//        }
    }
}