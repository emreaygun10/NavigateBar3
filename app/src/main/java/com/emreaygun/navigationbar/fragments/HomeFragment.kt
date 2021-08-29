package com.emreaygun.navigationbar.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.emreaygun.navigationbar.MainActivity
import com.emreaygun.navigationbar.R
import kotlinx.android.synthetic.main.activity_main.*


class HomeFragment : Fragment() {
  //  val fragmentManager =susupportFragmentManager
    //val fragmentTransaction=fragmentManager.beginTransaction()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var name=HomeFragmentDirections.actionHomeFragmentToSettingFragment("emre")
        val hometosetting=HomeFragmentDirections.actionHomeFragmentToSettingFragment()
        val hometofavorite=HomeFragmentDirections.actionHomeFragmentToFavoriteFragment()

         //Navigation.findNavController(view).navigate(name)

    }


}