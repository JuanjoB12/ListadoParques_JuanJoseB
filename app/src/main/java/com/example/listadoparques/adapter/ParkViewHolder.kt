package com.example.listadoparques.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Parque
import com.example.listadoparques.databinding.ItemParkBinding

class ParkViewHolder(view: View):RecyclerView.ViewHolder(view) {

    val binding = ItemParkBinding.bind(view)
    fun  render (ParkModel: Parque){
        binding.textView.text=ParkModel.tittle
        binding.textView2.text=ParkModel.description
        Glide.with(binding.imageView2.context).load(ParkModel.photo).into(binding.imageView2)

    }
}