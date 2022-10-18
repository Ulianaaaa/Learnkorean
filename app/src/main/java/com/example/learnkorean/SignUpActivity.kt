package com.example.learnkorean

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_sign_up.*
import java.util.regex.Pattern

class SignUpActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private val TAg = "SignInActivity"

//    private var mAuth: Firebase? = null
//    private var mAuthListner: FirebaseAuth.AuthStateListener? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        mAuth = firebaseAuth.getInstance()
//        mAuthListner = object : AuthStateListener() {
//            fun onAuthStateChanged(firebaseAuth: FirebaseAuth) {
//                val user: FirebaseUser = firebaseAuth.getCurrentUser()
//                if (user != null) {
//                } else {
//                }
//            }
//        }
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        auth = Firebase.auth
//        textView5.setOnClickListener { loginSignUpUser(editTextTextEmailAddress.text.toString().trim(),
//            editTextTextPassword.text.toString().trim()) }

    }

    private fun loginSignUpUser(email:String, password:String){
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAg, "signInWithEmail:success")
                    val user = auth.currentUser
                   // updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAg, "signInWithEmail:failure", task.exception)
                    Toast.makeText(this, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                   // updateUI(null)
                }
            }
    }

    fun clickoSwitchh(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }

    fun clickToReclamaa(view: View) {
        val email = editTextTextEmailAddress.text.toString()
        val login = editTextTextPersonName.text.toString()
        val password = editTextTextPassword.text.toString()
        val passwordconfirm = editTextConfPassword.text.toString()

        val pat = Pattern.compile("^[A-Za-z0-9]+@(.+)\$")
        val res = pat.matcher(email).matches()

        if (email.isEmpty() || login.isEmpty() || passwordconfirm.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "заполните все поля", Toast.LENGTH_SHORT).show()
        } else {
            if (!res){
                Toast.makeText(this, "email заполнен некорректно", Toast.LENGTH_SHORT).show()
            }
            else{
                if (password.length<8){
                    Toast.makeText(this, "пароли слишком короткий", Toast.LENGTH_SHORT).show()
                }
                else{
                    if (password!=passwordconfirm){
                        Toast.makeText(this, "пароли не совпадают", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        if (login.length<4){
                            Toast.makeText(this, "имя слишком короткое", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            val intent2 = Intent(this, ReclamaActivity::class.java)
                            startActivity(intent2)
                        }

                    }

                }

            }

        }
    }
}


    