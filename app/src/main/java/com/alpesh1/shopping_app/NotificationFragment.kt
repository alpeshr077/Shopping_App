package com.alpesh1.shopping_app

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.AlertDialog
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Context.NOTIFICATION_SERVICE
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alpesh1.shopping_app.databinding.FragmentNotificationBinding
import java.util.Calendar
import java.util.Date


class NotificationFragment : Fragment() {

    lateinit var binding: FragmentNotificationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNotificationBinding.inflate(layoutInflater)

//        createNotificationChannel()
//        binding.btnSchedule.setOnClickListener { scheduleNotification() }


        return binding.root
    }

//    @SuppressLint("ScheduleExactAlarm")
//    private fun scheduleNotification() {
//
//        val intent = Intent(context, Notification::class.java)
//        val title = binding.txtTitle.text.toString()
//        val message = binding.txtMessage.text.toString()
//        intent.putExtra(titleExtra, title)
//        intent.putExtra(messageExtra, message)
//
//        val pendingIntent = PendingIntent.getBroadcast(
//            context,
//            notificationID,
//            intent,
//            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
//        )
//
//        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
//        val time = getTime()
//        alarmManager.setExactAndAllowWhileIdle(
//
//            AlarmManager.RTC_WAKEUP,
//            time,
//            pendingIntent
//
//        )
//        showAlert(time, title, message)
//
//
//    }
//
//    private fun getSystemService(alarmService: String): Any {
//
//        return true
//
//    }
//
//    private fun getTime(): Long {
//
//        val minute = binding.timePicker.minute
//        val hour = binding.timePicker.hour
//        val day = binding.datePicker.dayOfMonth
//        val month = binding.datePicker.month
//        val year = binding.datePicker.year
//
//        val calendar = Calendar.getInstance()
//        calendar.set(year, month, day)
//        return calendar.timeInMillis
//
//    }
//
//    private fun showAlert(time: Long, title: String, message: String) {
//
//        val date = Date(time)
//        val dateFormat = android.text.format.DateFormat.getLongDateFormat(context)
//        val timeFormat = android.text.format.DateFormat.getTimeFormat(context)
//
//        AlertDialog.Builder(context)
//            .setTitle("Notification Schedule")
//            .setMessage(
//                "Title" + title + "\nMessage" + message + "\nAt:" + dateFormat.format(date) + "" + timeFormat.format(
//                    date
//                )
//            )
//            .setPositiveButton("Okay ") { _, _ -> }
//            .show()
//
//    }
//
//    @SuppressLint("NewApi")
//    private fun createNotificationChannel() {
//
//        val name = "Notifi Channel"
//        val desc = "A Description of the Channel"
//        val importance = NotificationManager.IMPORTANCE_DEFAULT
//        val channel = NotificationChannel(channelID, name, importance)
//        channel.description = desc
//        val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
//        notificationManager.createNotificationChannel(channel)
//
//    }

}