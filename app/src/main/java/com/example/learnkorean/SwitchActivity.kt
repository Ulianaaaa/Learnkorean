package com.example.learnkorean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_switch.*

class SwitchActivity : AppCompatActivity() {
    val fragmen1 : SwitchFirstFragment by lazy { SwitchFirstFragment() }
    val fragmen2 : SwitchSecondFragment by lazy { SwitchSecondFragment() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)
//
//        setFragment(R.id.frameFirst, fragmen1)
//        setFragment(R.id.frame2, fragmen2)

        val fragments : ArrayList<Fragment> = arrayListOf(
            SwitchFirstFragment(),
            SwitchSecondFragment()
        )
        viewpager.adapter = ViewPagerAdapter(fragments, this)


    }

    private fun setFragment(frame: Int, fragment : Fragment){
        val tr = supportFragmentManager.beginTransaction()
        tr.replace(frame, fragment)
        tr.commit()
    }

    override fun onBackPressed(){
        if (viewpager.currentItem==0)super.onBackPressed()
        else viewpager.currentItem = viewpager.currentItem -1
    }

    fun clickToSignUp(view: View) {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    fun clickToSignIn(view:View){
        val intent = Intent (this, SignInActivity::class.java)
        startActivity(intent)
    }





}