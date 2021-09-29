package com.example.ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var userinput= ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myRv =findViewById<RecyclerView>(R.id.rvMain)
        val button1=findViewById<Button>(R.id.button)
        val name = findViewById<EditText>(R.id.Name).text

        myRv.adapter= recyclerview(userinput)
        myRv.layoutManager= LinearLayoutManager(this)

        button1.setOnClickListener{


            userinput.add(name.toString())

            name.clear()
            myRv.adapter?.notifyDataSetChanged()
        }

    }
}