package com.alpesh1.shopping_app

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.alpesh1.shopping_app.databinding.FragmentProfileBinding
import com.google.firebase.auth.FirebaseAuth


class Profile_Fragment : Fragment() {

    private lateinit var auth: FirebaseAuth

    lateinit var SharedP: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProfileBinding.inflate(layoutInflater)

        auth = FirebaseAuth.getInstance()

//        SharedP = getSharedPreferences("First Time", Context.MODE_PRIVATE)
//
//        val email = intent.getStringExtra("email")
//        val displayName = intent.getStringExtra("name")
//
//        findViewById<TextView>(R.id.txtWelcome).text = email + "\n" + displayName
//
//        findViewById<Button>(R.id.btnLogout).setOnClickListener {
//
//            editor = SharedP.edit()
//            editor.clear()
//            editor.commit()
//
//            auth.signOut()
//            startActivity(Intent(context,LoginActivity::class.java))
//
//
//        }

        return binding.root
    }

}