package com.alpesh1.shopping_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alpesh1.shopping_app.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {

    lateinit var binding: ActivityAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }

    fun insert_data(view: View) {



    }
    fun insert_image(view: View) {



    }
}