package com.example.instagram.ui.likess

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R
import com.example.instagram.ui.home.StoryAdapter
import com.example.instagram.ui.home.StoryItem

class LikesAdapter(private var list: List<MsgReqItem>):
    RecyclerView.Adapter<LikesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_msgreq_likes,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageview.setImageResource(list[position].userrequest)
        holder.tvName.text=list[position].username

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageview: ImageView =itemView.findViewById(R.id.ivrequestedUser)
        var tvName: TextView =itemView.findViewById(R.id.tvrequestedUser)
    }

    }