package com.example.instagram.ui.messanger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagram.R
import kotlinx.android.synthetic.main.activity_messanger.*

class MessangerActivity : AppCompatActivity() {

    var fragmentAdapter=ViewPagerAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messanger)
        callingFragments()
    }

    private fun callingFragments() {
      fragmentAdapter.addFragment(ChatFragment(),"Chats")
      fragmentAdapter.addFragment(RoomsFragment(),"Rooms")
      fragmentAdapter.addFragment(MsgRequestFragment(),"Requests")

        viewPager.adapter =fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)
    }


}