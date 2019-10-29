package com.example.midas.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.midas.R
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*
import pyxis.uzuki.live.richutilskt.utils.toast


class MainActivity : AppCompatActivity() {
    lateinit var drawer: DrawerLayout;
    lateinit var toolbar: androidx.appcompat.widget.Toolbar;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding();


    }

    private fun binding() {
        toolbar = findViewById(R.id.toolbarMain)
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawerLayoutMain)
        val toggle = ActionBarDrawerToggle(
            this,
            drawer,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }


}
