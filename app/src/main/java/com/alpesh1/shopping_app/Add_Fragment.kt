package com.alpesh1.shopping_app

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.alpesh1.shopping_app.databinding.FragmentAddBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import java.io.ByteArrayOutputStream

class Add_Fragment : Fragment() {

    lateinit var binding: FragmentAddBinding
    lateinit var reference: DatabaseReference
    var sImage: String? = ""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAddBinding.inflate(layoutInflater)

        binding.btnsendActivity.setOnClickListener {

            var intent = Intent(context,AddActivity::class.java)
            startActivity(intent)

        }

        return binding.root
    }

}