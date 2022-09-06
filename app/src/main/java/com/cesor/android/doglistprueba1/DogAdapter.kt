package com.cesor.android.doglistprueba1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.cesor.android.doglistprueba1.databinding.DogItemBinding
import com.squareup.picasso.Picasso

/****
 * Project: DogListPrueba1
 * From: com.cesor.android.doglistprueba1
 * Created by: César Castro on 5/09/2022 at 20:58.
 ***/
class DogAdapter(private val images: List<String>):RecyclerView.Adapter<DogAdapter.DogViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DogViewHolder(layoutInflater.inflate(R.layout.dog_item, parent, false))
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        val item = images[position]
        with(holder){
            Picasso.get().load(item).into(binding.ivDog)
        }
    }

    override fun getItemCount(): Int = images.size

    inner class DogViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = DogItemBinding.bind(view)
    }
}