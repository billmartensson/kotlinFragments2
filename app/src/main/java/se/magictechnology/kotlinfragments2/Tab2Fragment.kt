package se.magictechnology.kotlinfragments2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_tab2.*

class Tab2Fragment : Fragment() {

    var countnumber = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab2, container, false)
    }

    override fun onStart() {
        super.onStart()

        tab2CountTV.text = countnumber.toString()

        tab2countBtn.setOnClickListener {
            countnumber = countnumber + 1
            tab2CountTV.text = countnumber.toString()
        }
    }



}