package com.example.prakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.prakt.databinding.ActivityCreatePasswordBinding

class CreatePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCreatePasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPass.setOnClickListener{
            if (binding.ePassword.text.toString().length == 4){
                App.dm.setPass(binding.ePassword.text.toString())
                startActivity(Intent(this, SecondActivity::class.java))
            }
            else {
                Toast.makeText(this, "Пароль не введён, надо 4 цифры", Toast.LENGTH_SHORT).show()
            }
        }

    }
}