package com.imran.examplearch.viewModels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.imran.examplearch.models.Note

class MainVM() :  ViewModel(){

    val facts = MutableLiveData<String>("this is a fact given by me")
//    val msg = MutableLiveData<String>()
    val msg = MutableLiveData<Note>()

    fun updateFact(fact:String){
        facts.value = fact
    }
/*
    fun updateMsg(note: Note){
        msg.value = note
    }
*/
    fun updateMsg(){
        msg.value = Note("pain","gain")
    Log.d("TAG2", "updateMsg: method is called")
    }



    var count = 8
    fun increment(){
        count++
    }
}