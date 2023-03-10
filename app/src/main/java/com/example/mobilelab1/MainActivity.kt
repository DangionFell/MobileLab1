package com.example.mobilelab1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("MyMainActivity","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.w("MyMainActivity","onCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.w("MyMainActivity","onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.w("MyMainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.w("MyMainActivity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("MyMainActivity","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("MyMainActivity","onDestroy")
    }

    fun onClickToDetailActivity(view : View){
        val intent = Intent(this, DetailedActivity::class.java)
        startActivity(intent)
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