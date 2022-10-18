package com.example.learnkorean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActvity : AppCompatActivity() {
    lateinit var parolFragment : ParolFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        parolFragment = ParolFragment()
        setFragmentnas(parolFragment)
    }

    fun clickToMainTwo(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun setFragmentnas(fragment: Fragment){
        if (button6!!.isClickable){
            val frTransactin = supportFragmentManager.beginTransaction()
            frTransactin.replace(R.id.framenas, fragment)
            frTransactin.commit()
        }

    }

    fun clickToParFrag(view: View) {
        setFragmentnas(parolFragment)
        view.visibility = View.VISIBLE
    }
}