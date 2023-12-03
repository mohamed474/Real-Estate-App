package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Fragments.ChatsFragment
import com.example.myapplication.Fragments.FavoriteFragment
import com.example.myapplication.Fragments.HomeFragment
import com.example.myapplication.Fragments.ProfileFragment
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->

            when (item.itemId) {
                R.id.item_home -> {
                    showHomeFragment()
                    true
                }

                R.id.item_chats -> {
                    showChatsListFragment()
                    true
                }

                R.id.item_favorite -> {
                    showFavoriteListFragment()
                    true
                }

                R.id.item_profile -> {
                    showProfileFragment()
                    true
                }

                else -> {
                    false
                }
            }

        }

    }

    private fun showHomeFragment() {
        binding.toolbarTitleTv.text = "Home"

        val fragment = HomeFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id, fragment, "HomeFragment")
        fragmentTransaction.commit()
    }

    private fun showChatsListFragment() {
        binding.toolbarTitleTv.text = "Chats"

        val fragment = ChatsFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id, fragment, "ChatsFragment")
        fragmentTransaction.commit()
    }

    private fun showFavoriteListFragment() {
        binding.toolbarTitleTv.text = "Favorite"

        val fragment = FavoriteFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id, fragment, "FavoriteFragment")
        fragmentTransaction.commit()
    }

    private fun showProfileFragment() {
        binding.toolbarTitleTv.text = "Profile"

        val fragment = ProfileFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.fragmentFl.id, fragment, "ProfileFragment")
        fragmentTransaction.commit()
    }


}