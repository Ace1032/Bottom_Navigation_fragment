package com.example.crimilanlintent_second_try

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crimilanlintent_second_try.databinding.FragmentCrimeDeatailBinding
import java.util.Date
import java.util.UUID

class CrimeDeatailFragment : Fragment() {
private lateinit var binding: FragmentCrimeDeatailBinding
private lateinit var crimeAdapter: CrimeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            Toast.makeText(activity,"Fragment oncreateView", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = FragmentCrimeDeatailBinding.inflate(inflater, container, false)
            return binding.root
    }


   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

            val crimes = listOf(
                Crime(1, "Dirty Dishes",Date().toString()),
                Crime(2, "Floor is not Clean",Date().toString()),
                Crime(3, "Dirty Toilet",Date().toString()),
            )
       crimeAdapter=CrimeAdapter(crimes)
       binding.crimeRecyclerView.apply{
           layoutManager= LinearLayoutManager(context)
           adapter=crimeAdapter
       }

        }

}