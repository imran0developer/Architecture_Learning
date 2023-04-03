package com.imran.examplearch.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.imran.examplearch.models.Post

class PostVM : ViewModel() {

    val postData = MutableLiveData<Post>()

    fun updatePost(post: Post){
        postData.value = post
    }


}