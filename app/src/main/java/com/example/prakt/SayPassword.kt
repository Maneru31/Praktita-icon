package com.example.prakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.prakt.databinding.ActivityCreatePasswordBinding
import com.example.prakt.databinding.ActivitySayPasswordBinding

class SayPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySayPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSay.setOnClickListener{
            if (binding.sayPass.text.toString().length == 4){
                if (App.dm.getPass() == binding.sayPass.text.toString()){
                    startActivity(Intent(this, SecondActivity::class.java))
                }
                else {
                    Toast.makeText(this, "Не правильный пароль", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}