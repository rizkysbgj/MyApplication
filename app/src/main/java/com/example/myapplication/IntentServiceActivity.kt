package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.classes.MyIntentService
import kotlinx.android.synthetic.main.activity_intent_service.*

class IntentServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)

        btnStartServiceIntent.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                tvServiceIntentInfo.text = "Service Running"
            }
        }

        btnStopServiceIntent.setOnClickListener {
            MyIntentService.stopService()
            tvServiceIntentInfo.text = "Service Stopped"
        }

        if(MyIntentService.isRunning) {
            tvServiceIntentInfo.text = "Service Running"
        }
    }
}