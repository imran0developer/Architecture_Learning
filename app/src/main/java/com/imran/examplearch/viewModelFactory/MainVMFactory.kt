package com.imran.examplearch.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.imran.examplearch.viewModels.MainVM

class MainVMFactory : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainVM() as T
    }
}
