package com.mohetabsem.androidfiles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_web_view.*

class webView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

//        web_view.loadUrl("https://github.com/")
        var URL =""
        web_view.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                URL=request.toString()
                return false
            }
        }
        web_view.loadUrl("https://github.com/")
        web_view.settings.javaScriptEnabled

    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        Toast.makeText(this,"btc back",Toast.LENGTH_SHORT)

        return if (keyCode==KeyEvent.KEYCODE_BACK && web_view.canGoBack()){
            web_view.goBack()
            true
        }else{
            Toast.makeText(this,"cant back",Toast.LENGTH_SHORT)
            return super.onKeyDown(keyCode, event)
        }
    }
}