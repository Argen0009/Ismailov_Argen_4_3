package com.example.ismailov_argen_4_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ismailov_argen_4_3.databinding.ActivityMainBinding
import com.example.ismailov_argen_4_3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Second
        val value = intent.getIntExtra("value", 0)
        binding.Second.text = value.toString()
    }
}
