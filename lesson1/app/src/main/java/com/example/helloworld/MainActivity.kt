package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

//设计讲究逻辑和视图分离
//在布局文件中编写界面，然后在Activity中引入进来。
class MainActivity : AppCompatActivity() {
//    这个方法是一个Activity被创建时必定要执行的方法
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView()方法，就是这个方法给当前的Activity引入了一个activity_main布局
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "onCreate: created")
    }
}