package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPagerTabLayoutAdapter(
    val images : List<Int>
) : RecyclerView.Adapter<ViewPagerTabLayoutAdapter.ViewPagerTabLayoutViewHolder>() {
    inner class ViewPagerTabLayoutViewHolder(itemView: View) : RecyclerView.ViewHolder (itemView)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerTabLayoutViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerTabLayoutViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewPagerTabLayoutViewHolder, position: Int) {
        val currentImage = images[position]
        holder.itemView.ivImage.setImageResource(currentImage)
    }

}