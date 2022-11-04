package com.example.listadoparques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.ParkProvider.Companion.parklist
import com.example.listadoparques.Parque
import com.example.listadoparques.R

class ParkAdapter(parklist: List<Parque>) : RecyclerView.Adapter<ParkViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParkViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)

        return ParkViewHolder(layoutInflater.inflate(R.layout.item_park,parent,false))
    }

    override fun onBindViewHolder(holder: ParkViewHolder, position: Int) {
        val item = parklist[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return parklist.size
    }
}