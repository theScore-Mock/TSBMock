package com.example.tsbmock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.sharedmock.TheData

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //////
        ///// some other changes needed to be done to address the change value to 2
        //////

        findViewById<TextView>(R.id.tvValue).text = TheData.value
    }
}