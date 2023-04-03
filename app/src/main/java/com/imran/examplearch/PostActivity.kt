package com.imran.examplearch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.imran.examplearch.bindingAdapters.setImageUrl
import com.imran.examplearch.models.Post
import com.imran.examplearch.databinding.ActivityPostBinding
import com.imran.examplearch.viewModelFactory.PostVMFactory
import com.imran.examplearch.viewModels.PostVM
import com.squareup.picasso.Picasso

class PostActivity : AppCompatActivity() {

    lateinit var bindPost: ActivityPostBinding
    lateinit var postVM: PostVM
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindPost = DataBindingUtil.setContentView(this,R.layout.activity_post)

        postVM = ViewModelProvider(this,PostVMFactory())[PostVM::class.java]

        val post = Post("holiday","this was my holiday",
        "https://cdn.pixabay.com/photo/2023/03/21/20/42/umbrellas-7868179__340.jpg")

        bindPost.postVMV = postVM
        bindPost.lifecycleOwner = this

        bindPost.button2.setOnClickListener{
            postVM.updatePost(Post("trip","this was my trip","https://cdn.pixabay.com/photo/2023/03/21/20/42/umbrellas-7868179__340.jpg"))
        }

    }
}