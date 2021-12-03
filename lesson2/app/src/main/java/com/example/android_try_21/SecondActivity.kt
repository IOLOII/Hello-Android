package com.example.android_try_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

import kotlinx.android.synthetic.main.second_layout.*

class SecondActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val extraData = intent.getStringExtra("extra_data")
        Log.d("SecondActivity", "extra data is $extraData")


//
        button2.setOnClickListener {
            val intent = Intent(this,FirstActivity::class.java)
            startActivity(intent)

//            val intent = Intent()
//            intent.putExtra("data_return", "Hello FirstActivity")
//            setResult(RESULT_OK, intent)
//            finish()

        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return", "Hello FirstActivity back menu pressed")
        setResult(RESULT_OK, intent)
        finish()
    }
}