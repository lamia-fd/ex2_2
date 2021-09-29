package com.example.ex2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class recyclerview(val userinput:ArrayList<String>):RecyclerView.Adapter<recyclerview.ItemHolder>() {
    class ItemHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
     return ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var input=userinput[position]
holder.itemView.apply {
    textView.text=input
}
    }

    override fun getItemCount()=userinput.count()

}