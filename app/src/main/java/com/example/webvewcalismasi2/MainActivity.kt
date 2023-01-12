package com.example.webvewcalismasi2

import android.media.audiofx.BassBoost.Settings
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.webview)
        webView.settings.setJavaScriptEnabled(true)

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {

                }
                return true
            }
        }
        webView.loadUrl("https://www.google.com")

    val textView :TextView =findViewById(R.id.textView)
        var id : String  = android.provider.Settings.Secure.getString(this.contentResolver, android.provider.Settings.Secure.ANDROID_ID)
        textView.text=" Device Id : +$id"


    }
    
}

