package se.magictechnology.kotlinfragments2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var currentTab = 0

    var secondTab = Tab2Fragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.mainFragmentHolder, Tab1Fragment()).commit()

        mainTab1CL.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mainFragmentHolder, Tab1Fragment()).commit()
            paintTabs(0)
        }
        mainTab2CL.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mainFragmentHolder, secondTab).commit()
            paintTabs(1)
        }
        mainTab3CL.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mainFragmentHolder, Tab3Fragment()).commit()
            paintTabs(2)
        }

        paintTabs(0)
    }

    fun paintTabs(clickedTab : Int)
    {
        currentTab = clickedTab

        mainTab1CL.setBackgroundColor(Color.WHITE)
        mainTab2CL.setBackgroundColor(Color.WHITE)
        mainTab3CL.setBackgroundColor(Color.WHITE)

        if(currentTab == 0)
        {
            mainTab1CL.setBackgroundColor(Color.LTGRAY)
        }
        if(currentTab == 1)
        {
            mainTab2CL.setBackgroundColor(Color.LTGRAY)
        }
        if(currentTab == 2)
        {
            mainTab3CL.setBackgroundColor(Color.LTGRAY)
        }
    }

    fun goTab1()
    {
        supportFragmentManager.beginTransaction().replace(R.id.mainFragmentHolder, Tab1Fragment()).commit()
        paintTabs(0)
    }

}