package com.imran.examplearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.imran.examplearch.viewModelFactory.MainVMFactory
import com.imran.examplearch.viewModels.MainVM

class MainActivity : AppCompatActivity() {

    lateinit var textView: EditText
    lateinit var mainVM: MainVM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG2", "onCreate: Activity On-Create")

        mainVM = ViewModelProvider(this, MainVMFactory())[MainVM::class.java]

        textView = findViewById(R.id.textView)

        mainVM.facts.observe(this){
            Log.d("TAG2", "onCreate: $it")
        }


        setText()

    }
    fun setText(){
        //textView.text = mainVM.count.toString()
    }


    override fun onStop() {
        super.onStop()
        Log.d("TAG2", "onStop: Activity On-Stop")
    }


}
