package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapter.ViewPagerAdapter
import com.example.myapplication.adapter.ViewPagerTabLayoutAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_swipe_view.*
import kotlinx.android.synthetic.main.activity_tab_layout.*

class TabLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val images = listOf(
            R.drawable.kumamon1,
            R.drawable.kumamon2,
            R.drawable.kumamon3,
            R.drawable.kumamon4,
            R.drawable.kumamon5
        )

        val adapter = ViewPagerTabLayoutAdapter(images)
        viewPagerTabLayout.adapter = adapter

        TabLayoutMediator(tabLayout, viewPagerTabLayout) {tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()
    }
}