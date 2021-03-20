package com.mohetabsem.androidfiles


import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_vedio.*


class vedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vedio)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.mm)
        val mediaController=MediaController(this)
        video.setMediaController(mediaController)
        video.setVideoURI(uri)
        //video.start()
    }
}