package com.myweb.ass6_sec3_613020172_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_three.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*


class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_three, container, false)
        view.female.setOnClickListener(){
            var fragment = OneFragment()
            replaceFragment(fragment)
        }
        return view
    }
    fun replaceFragment(female: Fragment){
        var transaction = fragmentManager!!.beginTransaction()
        transaction.replace(R.id.fragmentLayout, female)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}