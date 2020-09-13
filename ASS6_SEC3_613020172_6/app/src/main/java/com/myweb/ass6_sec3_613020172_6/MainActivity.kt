package com.myweb.ass6_sec3_613020172_6


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().add(
                    R.id.fragmentLayout,
                    OneFragment()
            ).commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        when(item?.itemId){
            R.id.icon1 -> {
                fragmentTransaction.replace(R.id.fragmentLayout, TwoFragment())
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
                return true
            }
            R.id.icon2 -> {
                fragmentTransaction.replace(R.id.fragmentLayout, ThreeFragment())
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }

    }
}