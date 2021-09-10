package com.example.instagram.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R

class StoryAdapter(private var myList: List<StoryItem>):
    RecyclerView.Adapter<StoryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_story_home,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.imageview.setImageResource(myList[position].image1)
        holder.tvName.text=myList[position].name

        if (position==0){
              holder.ltProfile.visibility = View.VISIBLE
             // holder.ltstory.visibility = View.GONE
        }else{
            holder.ltProfile.visibility = View.GONE
           // holder.ltstory.visibility = View.VISIBLE

        }
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageview: ImageView =itemView.findViewById(R.id.ivProfile)
        var tvName: TextView =itemView.findViewById(R.id.tvUSername)
        var ltProfile:RelativeLayout = itemView.findViewById(R.id.ltProfile)
        //var ltstory:RelativeLayout = itemView.findViewById(R.id.ltstory)


    }
}