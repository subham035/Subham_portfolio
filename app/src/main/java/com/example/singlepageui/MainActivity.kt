package com.example.singlepageui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun openGithub(view: View) {
        openUrl("https://github.com/subham035/")
    }
    fun openInstagram(view: View) {
        openUrl("https://www.instagram.com/")
    }
    fun openLinkdin(view: View) {
        openUrl("https://www.linkedin.com/in/subham-satyasundar-majhi-ab6424303/")
    }
    fun openGmail(view: View) {
        openUrl("https://subhammajhi669@gmail.com/")
    }


    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)}


}
