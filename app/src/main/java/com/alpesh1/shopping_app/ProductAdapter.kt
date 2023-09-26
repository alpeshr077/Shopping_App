package com.alpesh1.shopping_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ProductAdapter(private val itmlist:ArrayList<product_model>):RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    class ProductHolder(itemView: View) : ViewHolder(itemView){


        var itemName : TextView = itemView.findViewById(R.id.txtproductNameSet)
        var itemPrice : TextView = itemView.findViewById(R.id.txtproductPriceSet)
        var itemImage : TextView = itemView.findViewById(R.id.adimgImageSet)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {



        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.itemdata_list,parent,false)
        return ItemHolder(itemView,mListener)


    }

    override fun getItemCount(): Int {
        return itmlist.size
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {



    }

}