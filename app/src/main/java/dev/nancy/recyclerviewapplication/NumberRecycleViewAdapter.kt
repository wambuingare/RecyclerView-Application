package dev.nancy.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class NumberRecycleViewAdapter(var numberList: List<Int>):RecyclerView.Adapter<NumberRecycleViewAdapter.NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var ItemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.number_item_list,parent,false)
        return NumberViewHolder(ItemView)

    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumber.text=numberList.get(position).toString()

    }

    override fun getItemCount(): Int {
        return numberList.size

    }
    class NumberViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
    }
}