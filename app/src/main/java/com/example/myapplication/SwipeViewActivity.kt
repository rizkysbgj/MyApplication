package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_swipe_view.*

class SwipeViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_view)

        val images = listOf(
            R.drawable.kumamon1,
            R.drawable.kumamon2,
            R.drawable.kumamon3,
            R.drawable.kumamon4,
            R.drawable.kumamon5
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
    }
}