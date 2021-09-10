package com.example.instagram.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R

class ContentAdapter(private var list: List<ContentItem>):
    RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_content_home,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageview1.setImageResource(list[position].iv1)
        holder.tvName.text=list[position].tv1
      //  holder.imageview2.setImageResource(list[position].iv2)
        holder.imageview3.setImageResource(list[position].iv3)
        /*holder.imageview4.setImageResource(list[position].iv4)
        holder.imageview5.setImageResource(list[position].iv5)
        holder.imageview6.setImageResource(list[position].iv6)
        holder.imageview7.setImageResource(list[position].iv7)*/
        holder.imageview8.setImageResource(list[position].iv8)
        holder.imageview9.setImageResource(list[position].iv9)
        holder.imageview10.setImageResource(list[position].iv10)
        holder.tvName2.text=list[position].tv2
        holder.tvName3.text=list[position].tv3
        holder.tvName4.text=list[position].tv4
        holder.imageview11.setImageResource(list[position].iv11)
        holder.tvName5.text=list[position].tv5
        holder.imageview12.setImageResource(list[position].iv12)
        holder.imageview13.setImageResource(list[position].iv13)
        holder.imageview14.setImageResource(list[position].iv14)
        holder.tvName6.text=list[position].tv6




    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageview1: ImageView =itemView.findViewById(R.id.user1)
        var tvName: TextView =itemView.findViewById(R.id.Username)
        var imageview2: ImageView =itemView.findViewById(R.id.menu)
        var imageview3: ImageView =itemView.findViewById(R.id.postPicture)
        var imageview4: ImageView =itemView.findViewById(R.id.like)
        var imageview5: ImageView =itemView.findViewById(R.id.comment)
        var imageview6: ImageView =itemView.findViewById(R.id.share)
        var imageview7: ImageView =itemView.findViewById(R.id.save)
        var imageview8: ImageView =itemView.findViewById(R.id.person1)
        var imageview9: ImageView =itemView.findViewById(R.id.person2)
        var imageview10: ImageView =itemView.findViewById(R.id.person3)
        var tvName2: TextView =itemView.findViewById(R.id.likes)
        var tvName3: TextView =itemView.findViewById(R.id.allcomments)
        var tvName4: TextView =itemView.findViewById(R.id.commentedby)
        var imageview11: ImageView =itemView.findViewById(R.id.personaccount)
        var tvName5: TextView =itemView.findViewById(R.id.addcomment)
        var imageview12: ImageView =itemView.findViewById(R.id.emoji1)
        var imageview13: ImageView =itemView.findViewById(R.id.emoji2)
        var imageview14: ImageView =itemView.findViewById(R.id.emoji3)
        var tvName6: TextView =itemView.findViewById(R.id.time)



    }
}