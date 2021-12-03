package com.example.android_try_21

import android.app.Activity

class ActivityCollector {
    private val activites = ArrayList<Activity>()
    fun addActivity(activity: Activity){
        activites.add(activity)
    }
    fun removeActivity(activity: Activity){
        activites.remove(activity)
    }
    fun finishAll(){
        for (activity in activites){
            activity.finish()
        }
        activites.clear()
    }
}