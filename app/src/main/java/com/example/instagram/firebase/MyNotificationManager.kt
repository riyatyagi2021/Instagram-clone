package com.example.instagram.firebase

import android.content.Context.NOTIFICATION_SERVICE
import android.app.PendingIntent
import com.example.instagram.MainActivity
import android.content.Intent
import android.R
import android.content.Context
import androidx.core.app.NotificationCompat
import android.app.NotificationManager




class MyNotificationManager private constructor(private val mCtx: Context) {
    fun displayNotification(title: String?, body: String?) {
        val mBuilder: NotificationCompat.Builder =
            NotificationCompat.Builder(mCtx, Constants.CHANNEL_ID)
                .setSmallIcon(R.drawable.star_on)
                .setContentTitle(title)
                .setContentText(body)
        val resultIntent = Intent(mCtx, MainActivity::class.java)

        val pendingIntent =
            PendingIntent.getActivity(mCtx, 0, resultIntent, PendingIntent.FLAG_UPDATE_CURRENT)

       mBuilder.setContentIntent(pendingIntent)
        val mNotifyMgr = mCtx.getSystemService(NOTIFICATION_SERVICE) as NotificationManager

        mNotifyMgr?.notify(1, mBuilder.build())
    }

    companion object {
        private var mInstance: MyNotificationManager? = null
        @Synchronized
        fun getInstance(context: Context): MyNotificationManager? {
            if (mInstance == null) {
                mInstance = MyNotificationManager(context)
            }
            return mInstance
        }
    }
}