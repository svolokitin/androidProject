package com.example.gem

import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userLogin: EditText = findViewById(R.id.userLogin)
        val userEmail: EditText = findViewById(R.id.userEmail)
        val userPassword: EditText = findViewById(R.id.userPassword)
        val buttonReq: Button = findViewById(R.id.buttonReq)

        buttonReq.setOnClickListener {
            val login = userLogin.text.toString().trim()
            val email = userEmail.text.toString().trim()
            val pass = userPassword.text.toString().trim()

            if (login == "" || email == "" || pass == "") {
                Toast.makeText(this, "Fill in all field", Toast.LENGTH_LONG).show()
            }
            else {
                val user = User(login, email, pass)
            }
        }
    }
}