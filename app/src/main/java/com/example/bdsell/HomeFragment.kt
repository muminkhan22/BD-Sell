package com.example.bdsell

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.bdsell.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding=FragmentHomeBinding.inflate(layoutInflater,container,false)
        binding.addBtn?.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_manuFragment)
        }

        return binding.root
    }


}