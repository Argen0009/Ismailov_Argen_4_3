package com.example.ismailov_argen_4_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ismailov_argen_4_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    private var increasing = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button
        binding.pluss
        binding.button.setOnClickListener {
            if (increasing) {
                if (count < 10) {
                    count++
                    binding.button.text = "+1"
                } else {
                    increasing = false
                }
            } else {
                if (count > 0) {
                    count = -9
                    count--
                } else {
                    increasing = true
                    binding.button.text = "-1"
                }
            }

            binding.pluss.text = count.toString()

            if (count == 0) {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("value", count)
                startActivity(intent)
            }

        }


    }
}