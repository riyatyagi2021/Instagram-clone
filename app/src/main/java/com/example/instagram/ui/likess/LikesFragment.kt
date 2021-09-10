package com.example.instagram.ui.likess

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.instagram.R
import com.example.instagram.ui.home.ContentAdapter
import com.example.instagram.ui.home.ContentItem
import com.example.instagram.ui.home.StoryAdapter
import com.example.instagram.ui.home.StoryItem
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_likes.*

class LikesFragment:Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_likes, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var likesadapter: LikesAdapter
        var list = ArrayList<MsgReqItem>()
        for (i in 0..100) {
            list.add((MsgReqItem(R.drawable.profile, "riyagg requested to follow you")))
        }
        likesadapter= LikesAdapter(list)
        rvRequest.setHasFixedSize(true)
        rvRequest.adapter = likesadapter
    }

}