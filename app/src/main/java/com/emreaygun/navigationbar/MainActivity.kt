package com.emreaygun.navigationbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.emreaygun.navigationbar.fragments.FavoriteFragment
import com.emreaygun.navigationbar.fragments.HomeFragment
import com.emreaygun.navigationbar.fragments.SettingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment =HomeFragment()
        val favoriteFragment = FavoriteFragment()
        val settingFragment = SettingFragment()
        makeCurrentFragment(homeFragment)
        val fragmentManager =supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()


         bottom_navigation.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.ic_home->fragmentTransaction.add(R.id.fl_wrapper,homeFragment).commit()
                R.id.ic_favorite->fragmentTransaction.add(R.id.fl_wrapper,favoriteFragment).commit()
                R.id.ic_setting->fragmentTransaction.add(R.id.fl_wrapper,settingFragment).commit()
            }
        }


    }
    private fun makeCurrentFragment(fragment: Fragment)=supportFragmentManager.beginTransaction().apply {
        replace(R.id.fl_wrapper,fragment)
        commit()
    }


    }
