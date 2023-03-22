package com.example.testactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.example.testactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSet.text = getString(R.string.toast_Message)
        binding.btnSet.setOnClickListener {
            Toast.makeText(this@MainActivity, R.string.toast_Message, Toast.LENGTH_SHORT).show()
            //binding.btnSet.setTextColor(ResourcesCompat.getColor(resources, R.color.txt_color, null))
            Log.e("MainActivity", "R.string.toast_Message")
        }
    }
}