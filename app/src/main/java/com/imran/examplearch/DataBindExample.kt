package com.imran.examplearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.imran.examplearch.viewModelFactory.MainVMFactory
import com.imran.examplearch.viewModels.MainVM
import com.imran.examplearch.databinding.ActivityBindBinding

class DataBindExample : AppCompatActivity() {

    lateinit var bindExample: ActivityBindBinding
    lateinit var bindVM : MainVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindExample = DataBindingUtil.setContentView(this,R.layout.activity_bind)
//        setContentView(R.layout.activity_bind)

        bindVM = ViewModelProvider(this, MainVMFactory())[MainVM::class.java]


    /*    bindVM.msg.observe(this){
            bindExample.title.text = it.title
            bindExample.des.text = it.des
        }*/



   /*     bindExample.button.setOnClickListener{
            val text = bindExample.inputTitle.text.toString()
            val text2 = bindExample.inputDes.text.toString()
        bindVM.updateMsg(Note(text,text2))

//            val noteObj = Note("Mohabbat mohabbat",))
//            bindExample.note = noteObj
        }*/



        bindExample.mainVM = bindVM
        bindExample.lifecycleOwner = this


    }
}