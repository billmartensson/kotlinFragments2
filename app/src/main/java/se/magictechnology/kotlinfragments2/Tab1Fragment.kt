package se.magictechnology.kotlinfragments2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_tab1.*

class Tab1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false)
    }

    override fun onStart() {
        super.onStart()

        readmoreBtn.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().add(R.id.mainFragmentHolder, ReadmoreFragment()).addToBackStack("tab1").commit()
        }
    }

}