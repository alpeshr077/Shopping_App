package com.alpesh1.shopping_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.alpesh1.shopping_app.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(Home_Fragment())

        binding.bottomNavigation.setOnNavigationItemSelectedListener(object :
            BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {

                when (item.itemId) {
                    R.id.home -> {
                        loadFragment(Home_Fragment())
                    }

                    R.id.notification -> {
                        loadFragment(NotificationFragment())
                    }

                    R.id.add -> {
                        loadFragment(Add_Fragment())
                    }

                    R.id.category -> {
                        loadFragment(Category_Fragment())
                    }

                    R.id.profile -> {
                        loadFragment(Profile_Fragment())
                    }
                }

                return true
            }

        })

    }

    private fun loadFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().replace(R.id.fragFrame,fragment).commit()

    }
}