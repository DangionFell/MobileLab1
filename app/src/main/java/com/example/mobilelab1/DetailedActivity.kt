package com.example.mobilelab1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
        Log.w("MyDetailedActivity","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("MyDetailedActivity","onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.w("MyDetailedActivity","onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.w("MyDetailedActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("MyDetailedActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("MyDetailedActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MyDetailedActivity","onDestroy")
    }

    private fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        startActivity(intent)
    }

    fun onClickToLink(view : View){
        val url = "https://www.twitch.tv/"
        openWebPage(url)
    }

}