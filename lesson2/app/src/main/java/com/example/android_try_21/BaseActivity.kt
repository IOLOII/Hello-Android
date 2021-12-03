package com.example.android_try_21

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
//        Kotlin中的javaClass表示获取当前实例的Class对象，相当于在Java中调用getClass()方法
//        而Kotlin中的BaseActivity::class.java表示获取BaseActivity类的Class对象，相当于在Java中调用BaseActivity.class。
        Log.d("BaseActivity",javaClass.simpleName)
    }
}