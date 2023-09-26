package com.alpesh1.shopping_app

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alpesh1.shopping_app.databinding.FragmentHomeBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


class Home_Fragment : Fragment() {

    lateinit var reference: DatabaseReference
    lateinit var recyclerView: RecyclerView
    lateinit var itemlist : ArrayList<product_model>
    lateinit var binding: FragmentHomeBinding
    private var nodeList = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(layoutInflater)


        recyclerView = binding.rcvProduct
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.hasFixedSize()
        itemlist = arrayListOf<product_model>()

        getItemData()


        return binding.root
    }

    private fun getItemData() {


        reference = FirebaseDatabase.getInstance().getReference("items")

        

    }