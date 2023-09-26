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
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        binding = FragmentAddBinding.inflate(layoutInflater)

        return binding.root
    }

    fun insert_data(view: View) {

        var itemName = binding.productName.text.toString()
        var itemRate = binding.productPrice.text.toString()

        reference = FirebaseDatabase.getInstance().getReference("items")

    if (itemName.isEmpty()){
        Toast.makeText(context, "please enter product name", Toast.LENGTH_SHORT).show()
    }else if (itemRate.isEmpty()){
        Toast.makeText(context, "please enter product price", Toast.LENGTH_SHORT).show()
    }else{

        val item = product_model(itemName, itemRate,sImage)
        val databaseReference = FirebaseDatabase.getInstance().reference
        val id = databaseReference.push().key
        reference.child(id.toString()).setValue(item).addOnSuccessListener {

            binding.productName.text.clear()
            binding.productPrice.text.clear()
            Toast.makeText(context, "data inserted", Toast.LENGTH_SHORT).show()

        }.addOnFailureListener {

            Toast.makeText(context, "data not inserted", Toast.LENGTH_SHORT).show()

        }

    }

    }

    fun insert_image(view: View) {


        var myfileintent = Intent(Intent.ACTION_GET_CONTENT)
        myfileintent.setType("image/*")
        ActivityResultLauncher.launch(myfileintent)

    }

    private val ActivityResultLauncher = registerForActivityResult<Intent, ActivityResult>(
        ActivityResultContracts.StartActivityForResult()
    ) { result: ActivityResult ->

        if (result.resultCode == AppCompatActivity.RESULT_OK) {
            val uri = result.data!!.data
            try {

                val inputStreem = context?.contentResolver?.openInputStream(uri!!)
                val myBitmap = BitmapFactory.decodeStream(inputStreem)
                val stream = ByteArrayOutputStream()
                myBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
                val bytes = stream.toByteArray()
                sImage = android.util.Base64.encodeToString(bytes, android.util.Base64.DEFAULT)
                binding.imgSelect.setImageBitmap(myBitmap)
                inputStreem!!.close()
                Toast.makeText(context, "Image Selected", Toast.LENGTH_SHORT).show()

            } catch (ex: Exception) {
                Toast.makeText(context, ex.message.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }


}