package com.hmwn.gatherloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.himawanmasyaid.mylibrary.InternetConnection
import com.hmwn.gatherloop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHello.setOnClickListener {
            if (InternetConnection.isInternetConnected(this@MainActivity)) {
                toast("Connected")
            } else {
                toast("Disconnected")
            }
        }

    }

    fun toast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
    }

}