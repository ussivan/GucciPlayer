package com.example.gucciplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val player by lazy { MediaPlayer.create(this, R.raw.happy_feet) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.pause).setOnClickListener {
            player.pause()
        }
        findViewById<Button>(R.id.start).setOnClickListener {
            player.start()
        }
        findViewById<Button>(R.id.stop).setOnClickListener {
            player.stop()
        }
    }

}