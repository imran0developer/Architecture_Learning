package com.imran.examplearch

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVM() :  ViewModel(){

    val facts = MutableLiveData<String>("this is a fact given by me")
//    val msg = MutableLiveData<String>()
    val msg = MutableLiveData<Note>()

    fun updateFact(fact:String){
        facts.value = fact
    }
    fun updateMsg(note: Note){
        msg.value = note
    }


    var count = 8
    fun increment(){
        count++
    }
}