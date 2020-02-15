package com.android.rampage.upworkn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.rampage.upworkn.models.CardScan

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getCardsImage() : String {
        return "file:///android_asset/sample.jpg"
    }

    fun cardsScanResult(scannedCards : List<CardScan>)  {
        //Todo: Process cardsScanResult
    }
}
