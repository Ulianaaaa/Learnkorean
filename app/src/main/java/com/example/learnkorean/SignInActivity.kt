package com.example.learnkorean

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*
import java.util.regex.Pattern

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }

    fun clickToReclama(view: View) {

        val emaill = eeditTextTextEmailAddress.text.toString()
        val passwordd = editTextTextPasswordd.text.toString()

        val patt = Pattern.compile("^[A-Za-z0-9]+@(.+)\$")
        val ress = patt.matcher(emaill).matches()

        if (emaill.isEmpty() || passwordd.isEmpty()) {
            Toast.makeText(this, "заполните все поля", Toast.LENGTH_SHORT).show()
        } else {
            if (!ress){
                Toast.makeText(this, "email заполнен некорректно", Toast.LENGTH_SHORT).show()
            }
            else{
                if (passwordd.length<8){
                    Toast.makeText(this, "пароли слишком короткий", Toast.LENGTH_SHORT).show()
                }
                else{
                        val intent2 = Intent(this, ReclamaActivity::class.java)
                        startActivity(intent2)
                    }
            }

        }


    }
    fun clickToSwitch(view: View) {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
    }
}