package com.example.instagram.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.R
import com.example.instagram.base.BaseActivity
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.story_item.*

class DashboardActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

         forStory()
        forContent()

    }

    private fun forContent() {
        lateinit var contentadapter:ContentAdapter
        var List = ArrayList<ContentItem>()
        for (i in 0..100) {
            List.add((ContentItem(R.drawable.profile, tv1 = "riyatyagi",R.drawable.dots,R.drawable.img1,R.drawable.heart,R.drawable.comment,R.drawable.share,R.drawable.save,R.drawable.user1,R.drawable.user2,R.drawable.user3,"Liked by riya and 220 others","View all comments","Add a comment",R.drawable.profile,"Nice",R.drawable.child,R.drawable.fire,R.drawable.addcomment,"12 hours ago")))

        }
       contentadapter = ContentAdapter(List)
        rv2.setHasFixedSize(true)
        rv2.adapter =   contentadapter
    }



    private fun forStory() {

       var storyadapter:StoryAdapter

        var myList = ArrayList<StoryItem>()
        for (i in 0..100) {
            myList.add((StoryItem(R.drawable.profile, name = "riya")))

        }
        storyadapter = StoryAdapter(myList)
        rv1.setHasFixedSize(true)
        rv1.adapter = storyadapter
    }


}