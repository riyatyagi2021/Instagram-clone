package com.example.instagram

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.MotionEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.instagram.firebase.Constants
import com.example.instagram.firebase.MyNotificationManager
import kotlinx.android.synthetic.main.activity_main.*
import com.example.instagram.ui.home.HomeFragment
import com.example.instagram.ui.likess.LikesFragment
import com.example.instagram.ui.messanger.MessangerActivity
import com.example.instagram.ui.profile.ProfileFragment
import com.example.instagram.ui.reels.ReelsFragment
import com.example.instagram.ui.search.SearchFragment
import com.google.firebase.database.FirebaseDatabase


class MainActivity:AppCompatActivity(){

    val homeFragment = HomeFragment()
    val searchFragment = SearchFragment()
    val reelsFragment = ReelsFragment()
    val likesFragment = LikesFragment()
    val profileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
        setListener()
        notification()
        topicNotification()
        //touchListener()
    }

   /* private fun touchListener() {
        mainscreen.setOnTouchListener(
    }*/

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action){
            MotionEvent.ACTION_UP->{
                 val intent= Intent(this, MessangerActivity::class.java)
                startActivity(intent)
            }
        }

        return super.onTouchEvent(event)
    }

    private fun topicNotification() {

        /*     if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val mNotificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            val importance = NotificationManager.IMPORTANCE_HIGH
            val mChannel =
                NotificationChannel(Constants.CHANNEL_ID, Constants.CHANNEL_NAME, importance)
            mChannel.description = Constants.CHANNEL_DESCRIPTION
            mChannel.enableLights(true)
            mChannel.lightColor = Color.RED
            mChannel.enableVibration(true)
            mChannel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500, 400, 300, 200, 400)
            mNotificationManager.createNotificationChannel(mChannel)
        }

           buttonSubscribe.setOnClickListener {
            val topic: String = spinnerTopics.getSelectedItem().toString()
            FirebaseMessaging.getInstance().subscribeToTopic(topic)
            Toast.makeText(applicationContext, "Topic Subscribed", Toast.LENGTH_LONG).show()
        }
            */
    }

    private fun notification() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val mNotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val importance = NotificationManager.IMPORTANCE_HIGH
            val mChannel =
                NotificationChannel(Constants.CHANNEL_ID, Constants.CHANNEL_NAME, importance)
            mChannel.description = Constants.CHANNEL_DESCRIPTION
            mChannel.enableLights(true)
            mChannel.lightColor = Color.RED
            mChannel.enableVibration(true)
            mChannel.vibrationPattern = longArrayOf(100, 200, 300, 400, 500, 400, 300, 200, 400)
            mNotificationManager.createNotificationChannel(mChannel)
        }
           //MyNotificationManager.getInstance(this)!!
            //.displayNotification("Greetings", "Hello how are you?")
 }


    private fun setListener() {
                   // Fragments
        makeCurrentFragment(homeFragment)
        bottomNavigationBar.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.search -> makeCurrentFragment(searchFragment)
                R.id.reels -> makeCurrentFragment(reelsFragment)
                R.id.likes -> makeCurrentFragment(likesFragment)
                R.id.profile -> makeCurrentFragment(profileFragment)
            }
            true
        }
    }
    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainscreen, fragment)
            commit()
        }
    }


                     ////////////////Realtime storage

    private fun initUI() {
        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("message")

        val key = myRef.push().key
        if (key != null) {
            myRef.child(key).setValue("hello")
        }
        FirebaseDatabase.getInstance().getReference("message").get().addOnSuccessListener {
            println("DDDDDDDDDDDDDDDDDDDDDDDDDDDd ${it.value}")
        }
    }



}