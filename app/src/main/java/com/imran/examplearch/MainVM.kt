package com.imran.examplearch

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainVM() :  ViewModel(){

    val facts = MutableLiveData<String>("this is a fact given by me")

    fun updateFact(fact:String){
        facts.value = fact
    }


    var count = 8
    fun increment(){
        count++
    }
}