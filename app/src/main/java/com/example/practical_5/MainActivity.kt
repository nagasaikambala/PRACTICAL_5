package com.example.practical_5

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.os.Handler
import android.widget.SeekBar
import kotlinx.coroutines.NonCancellable.start

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun play(view: View) {
        mediaPlayer = MediaPlayer.create(applicationContext,R.raw.song)
        mediaPlayer.start()
    }
    fun Stop(view: View) {
        mediaPlayer.stop()
        mediaPlayer = MediaPlayer.create(applicationContext,R.raw.song)
    }
    fun Pause(view: View){
        mediaPlayer.pause()
    }
}