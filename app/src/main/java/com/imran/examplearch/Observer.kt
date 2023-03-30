package com.imran.examplearch

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent


class Observer : LifecycleObserver{

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreation(){
        Log.d("TAG2", "onCreation: Observer On-Create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStopping(){
        Log.d("TAG2", "onStopping: Observer On-Stop")
    }

}