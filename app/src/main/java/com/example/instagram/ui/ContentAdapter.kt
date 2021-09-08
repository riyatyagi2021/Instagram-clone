package com.example.instagram.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R

class ContentAdapter(private var List: List<ContentItem>):
    RecyclerView.Adapter<ContentAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageview1.setImageResource(List[position].iv1)
        holder.tvName.text=List[position].tv1
        holder.imageview2.setImageResource(List[position].iv2)
        holder.imageview3.setImageResource(List[position].iv3)
        holder.imageview4.setImageResource(List[position].iv4)
        holder.imageview5.setImageResource(List[position].iv5)
        holder.imageview6.setImageResource(List[position].iv6)
        holder.imageview7.setImageResource(List[position].iv7)
        holder.imageview8.setImageResource(List[position].iv8)
        holder.imageview9.setImageResource(List[position].iv9)
        holder.imageview10.setImageResource(List[position].iv10)
        holder.tvName2.text=List[position].tv2
        holder.tvName3.text=List[position].tv3
        holder.tvName4.text=List[position].tv4
        holder.imageview11.setImageResource(List[position].iv11)
        holder.tvName5.text=List[position].tv5
        holder.imageview12.setImageResource(List[position].iv12)
        holder.imageview13.setImageResource(List[position].iv13)
        holder.imageview14.setImageResource(List[position].iv14)
        holder.tvName6.text=List[position].tv6




    }

    override fun getItemCount(): Int {
        return List.size
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