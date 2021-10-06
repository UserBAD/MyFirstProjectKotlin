package com.example.myfirstprojectkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.myfirstprojectkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonDataClass = findViewById<Button>(R.id.key_data_class)
        buttonDataClass.setOnClickListener(clickListener)
        val buttonObjects = findViewById<Button>(R.id.key_object)
        buttonDataClass.setOnClickListener(clickListener)

    }

    private val clickListener = View.OnClickListener { view ->
        val client = ClientObject.name
        val passport = PassportData("Ivan", 30)
        val copyPassport = passport.copy(name = "Petr")
        when (view.id) {
            R.id.key_data_class -> Toast.makeText(applicationContext, copyPassport, Toast.LENGTH_SHORT).show()
            R.id.key_data_class -> Toast.makeText(applicationContext, client, Toast.LENGTH_SHORT).show()
        }
    }
}
