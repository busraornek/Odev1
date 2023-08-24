package com.busraornek.odev1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.ubuntuyouiwe.fragmentders.R
import com.ubuntuyouiwe.fragmentders.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {

    private lateinit var tasarim: FragmentBirinciBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentBirinciBinding.inflate(inflater,container,false)
        tasarim.buttonGiris.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.birincidenIkinciyeGecis)

        }
        return tasarim.root
    }


}