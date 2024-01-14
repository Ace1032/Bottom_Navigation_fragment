package com.example.crimilanlintent_second_try

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.crimilanlintent_second_try.databinding.FragmentCrimeDeatailBinding

class CrimeDeatailFragment : Fragment() {
private lateinit var binding: FragmentCrimeDeatailBinding

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
        Log.d("FragmentDebug", "onCreateView"  )
            binding = FragmentCrimeDeatailBinding.inflate(inflater, container, false)
            return binding.root
    }

}