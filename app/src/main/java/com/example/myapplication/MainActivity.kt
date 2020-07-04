package com.example.myapplication

import android.Manifest
import android.app.Activity
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.ScrollView
import androidx.core.app.ActivityCompat
import androidx.core.app.FrameMetricsAggregator
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var imageUri : Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExplicitIntent.setOnClickListener {
            Intent(this, AttendanceActivity::class.java).also {
                startActivity(it)
            }
        }

        btnToolbarMenu.setOnClickListener {
            Intent(this, ToolbarMenuActivity::class.java).also {
                startActivity(it)
            }
        }

        btnAlertDialog.setOnClickListener {
            Intent(this, AlertDialogActivity::class.java).also {
                startActivity(it)
            }
        }

        btnSpinner.setOnClickListener {
            Intent(this, SpinnerActivity::class.java).also {
                startActivity(it)
            }
        }

        btnRecycler.setOnClickListener {
            Intent(this, RecyclerActivity::class.java).also {
                startActivity(it)
            }
        }

        btnFragment.setOnClickListener {
            Intent(this, FragmentActivity::class.java).also {
                startActivity(it)
            }
        }

        btnNavigation.setOnClickListener {
            Intent(this, NavigationActivity::class.java).also {
                startActivity(it)
            }
        }

        btnSwipeAbleView.setOnClickListener {
            Intent(this, SwipeViewActivity::class.java).also {
                startActivity(it)
            }
        }

        btnTabLayout.setOnClickListener {
            Intent(this, TabLayoutActivity::class.java).also {
                startActivity(it)
            }
        }

        btnSlideAbleMenu.setOnClickListener {
            Intent(this, SlideAbleMenuActivity::class.java).also {
                startActivity(it)
            }
        }

        btnSharedPreferences.setOnClickListener {
            Intent(this, SharedPreferencesActivity::class.java).also {
                startActivity(it)
            }
        }

        btnNotification.setOnClickListener {
            Intent(this, NotificationActivity::class.java).also {
                startActivity(it)
            }
        }

        btnIntentService.setOnClickListener {
            Intent(this, IntentServiceActivity::class.java).also {
                startActivity(it)
            }
        }

        btnServices.setOnClickListener {
            Intent(this, ServicesActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
