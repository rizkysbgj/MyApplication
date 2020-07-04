package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.classes.MyIntentService
import com.example.myapplication.classes.MyService
import kotlinx.android.synthetic.main.activity_services.*

class ServicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_services)

        btnStartService.setOnClickListener {
            Intent(this, MyService::class.java).also {
                startService(it)
                tvServiceInfo.text = "Service Running"
            }
        }

        btnStopService.setOnClickListener {
            Intent(this, MyService::class.java).also {
                stopService(it)
                tvServiceInfo.text = "Service Stopped"
            }
        }

        btnSendDataService.setOnClickListener {
            Intent(this, MyService::class.java).also {
                val dataString = edtDataService.text.toString()
                it.putExtra("EXTRA_DATA", dataString)
                startService(it)
            }
        }
    }
}