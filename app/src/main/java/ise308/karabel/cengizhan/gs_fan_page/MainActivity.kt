package ise308.karabel.cengizhan.gs_fan_page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.main_layout_coach)
        setContentView(R.layout.main_page)
       // setContentView(R.layout.main_layout_team)
    }

    fun loadMainPage(v: View) {

        setContentView(R.layout.main_page)
    }
    fun loadMainLayoutTeam(v: View) {

        setContentView(R.layout.main_layout_team)
    }

    fun loadMainLayoutCoach(v: View) {

        setContentView(R.layout.main_layout_coach)
    }
    fun loadMainLayoutBio(v: View) {

        setContentView(R.layout.biografi_layout)
    }



}