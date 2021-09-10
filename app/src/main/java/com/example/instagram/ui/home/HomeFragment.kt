package com.example.instagram.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.instagram.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment :Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //For posts
        lateinit var contentadapter: ContentAdapter
        var List = ArrayList<ContentItem>()
        for (i in 0..100) {
            List.add((ContentItem(R.drawable.profile, tv1 = "riyatyagi",R.drawable.img1,R.drawable.user1,R.drawable.user2,R.drawable.user3,"Liked by riya and 220 others","View all comments","Add a comment",R.drawable.profile,"Nice",R.drawable.child,R.drawable.fire,R.drawable.addcomment,"12 hours ago")))
        }
        contentadapter = ContentAdapter(List)
        rv2.setHasFixedSize(true)
        rv2.adapter = contentadapter

      //For stories
        var storyadapter: StoryAdapter
        var myList = ArrayList<StoryItem>()
        for (i in 0..100) {
            myList.add((StoryItem(R.drawable.profile, name = "riya")))
        }
        storyadapter = StoryAdapter(myList)
        rv1.setHasFixedSize(true)
        rv1.adapter = storyadapter
    }
}
