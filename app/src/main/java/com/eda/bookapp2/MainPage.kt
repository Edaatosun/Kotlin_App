package com.eda.bookapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import com.eda.bookapp2.databinding.ActivityMainPageBinding

class MainPage : AppCompatActivity() {

    private lateinit var binding: ActivityMainPageBinding
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        drawerLayout = binding.drawerLayout
        recyclerView = binding.Cards

        val selectedIconMenu: ImageButton = binding.drawerMenu

        selectedIconMenu.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }
    }
}