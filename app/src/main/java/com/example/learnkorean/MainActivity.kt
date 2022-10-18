package com.example.learnkorean

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val database = Firebase.database
//        val myRef = database.getReference("message")
//
//        myRef.setValue("Hello, World!")


        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.title = ""

        supportActionBar!!.addOnMenuVisibilityListener {
            if (it) background.visibility = View.VISIBLE
            else background.visibility = View.INVISIBLE
        }


    }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true


    }
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.menu, menu)
//        return super.onCreateOptionsMenu(menu)
//    }
//
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
    if (item.itemId == R.id.nastroyki ) {
        val intent = Intent(this, SettingsActvity::class.java)
        Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        startActivity(intent)
    }

    if (item.itemId == R.id.vihod) {
        val intent2 = Intent(this, SignUpActivity::class.java)
        Toast.makeText(this, "Выход", Toast.LENGTH_SHORT).show()
        startActivity(intent2)
    }
    return true
    }



}

