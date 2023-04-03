package com.imran.examplearch.bindingAdapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter

import com.squareup.picasso.Picasso

@BindingAdapter("image_url")
fun ImageView.setImageUrl(url:String?){ // this question mark saved me from null pointer exception
    // that i got earlier and it resolved after just adding ? after string


    Picasso.get().load(url).into(this)
    //here we can do any thing when this methdo is called

}