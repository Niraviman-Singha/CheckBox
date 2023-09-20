package com.example.checkboxdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.checkboxdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

     val binding by lazy {
         ActivityMainBinding.inflate(layoutInflater)
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var msg:String = ""

            if(binding.checkBox.isChecked){
                msg = "Reading is Selected"
            }
            if (binding.checkBox2.isChecked){
                msg = "Coding is Selected"
            }
            if(binding.checkBox3.isChecked){
                msg = "Playing is Selected"
            }
            if(binding.checkBox4.isChecked){
                msg = "Gardening is Selected"
            }

            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        }
    }
}