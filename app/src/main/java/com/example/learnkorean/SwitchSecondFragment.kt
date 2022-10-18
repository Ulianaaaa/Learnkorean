package com.example.learnkorean

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class SwitchSecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_switch_second, container, false)
//        val but3 = view.findViewById<ImageView>(R.id.imageView5)
//        but3.setImageResource(R.drawable.whitee)
//        val but4 = view.findViewById<ImageView>(R.id.imageView6)
//        but4.setImageResource(R.drawable.greene)

        return view
    }

}
//        val butt = button
//        butt.setOnClickListener(object : View.OnClickListener {
//            fun clickToSignUp(v: View?) {
//                val intent = Intent(context, SignUpActivity::class.java)
//                startActivity(intent)
//            }
//
//            override fun onClick(p0: View?) {
//                val intent = Intent(context, SignUpActivity::class.java)
//                startActivity(intent)
//            }
//        })