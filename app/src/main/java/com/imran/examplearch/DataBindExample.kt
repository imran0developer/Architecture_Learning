package com.imran.examplearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.imran.examplearch.databinding.ActivityBindBinding

class DataBindExample : AppCompatActivity() {

    lateinit var bindExample: ActivityBindBinding
    lateinit var bindVM : MainVM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindExample = DataBindingUtil.setContentView(this,R.layout.activity_bind)
//        setContentView(R.layout.activity_bind)

        bindVM = ViewModelProvider(this,MainVMFactory()).get(MainVM::class.java)

        bindVM.msg.observe(this){
//            val noteObj = Note("Mohabbat mohabbat",it)
            bindExample.note = it
        }
        bindExample.button.setOnClickListener{
            val text = bindExample.input.text.toString()
            val text2 = bindExample.input.text.toString()
            bindVM.updateMsg(Note(text,text2))

//            val noteObj = Note("Mohabbat mohabbat",))
//            bindExample.note = noteObj
        }

     /*   bindVM.msg.observe(this){
            val noteObj = Note("Mohabbat mohabbat",it)
            bindExample.note = noteObj
        }



        bindExample.button.setOnClickListener{
            val text = bindExample.input.text.toString()
            bindVM.updateMsg(text)

//            val noteObj = Note("Mohabbat mohabbat",))
//            bindExample.note = noteObj
        }*/





    }
}