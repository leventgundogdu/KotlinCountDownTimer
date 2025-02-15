package com.leventgundogdu.countdownkotlin

import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.leventgundogdu.countdownkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Abstract - Interface - Inheritance

        object : CountDownTimer(10000, 1000) { //Typing by miliseconds
            override fun onTick(millisUntilFinished: Long) {
                binding.textView.text = "Left: ${millisUntilFinished / 1000}" //This countdown is not always accurate.
            }

            override fun onFinish() {
                binding.textView.text = "Left: 0"
            }

        }.start()

    }

}