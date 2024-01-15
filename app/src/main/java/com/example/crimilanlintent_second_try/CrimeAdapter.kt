package com.example.crimilanlintent_second_try

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crimilanlintent_second_try.databinding.ItemCrimeBinding

class CrimeAdapter(private val crimes: List<Crime>) : RecyclerView.Adapter<CrimeAdapter.CrimeHolder>(){

    private lateinit var binding: ItemCrimeBinding


    inner class CrimeHolder(binding: ItemCrimeBinding): RecyclerView.ViewHolder(binding.root){

        fun bind(crime: Crime){
            binding.crimeTitleViewId.text=crime.title
            binding.crimeDateViewId.text=crime.date
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrimeHolder {

        //val view = LayoutInflater.from(parent.context).inflate(R.layout.item_crime, parent, false)

        binding= ItemCrimeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CrimeHolder(binding)
    }

    override fun getItemCount(): Int {
        return crimes.size
    }

    override fun onBindViewHolder(holder: CrimeHolder, position: Int) {
        val crime = crimes[position]
        holder.bind(crime)
    }


}