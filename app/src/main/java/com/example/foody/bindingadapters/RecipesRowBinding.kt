package com.example.foody.bindingadapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import coil.load
import com.example.foody.R

class RecipesRowBinding {



    companion object{

        const val TIME = 600

        @BindingAdapter("loadImageFromUrl")
        @JvmStatic
        fun loadImageFromUrl(imageView: ImageView, url: String){
            imageView.load(url){
                crossfade(TIME)
            }
        }

        @BindingAdapter("setNumberOfLikes")
        @JvmStatic
        fun likesToString(textView : TextView, likes: Integer){
            textView.text = likes.toString()
        }

        @BindingAdapter("setTime")
        @JvmStatic
        fun timeToString(textView : TextView, time: Integer){
            textView.text = time.toString()
        }


        @BindingAdapter("applyVeganColor")
        @JvmStatic
        fun applyVeganColor(view : View, vegan: Boolean){
            if(vegan) {
                when (view) {
                    is TextView -> view.setTextColor(ContextCompat.getColor(view.context, R.color.green))
                    is ImageView -> view.setColorFilter(ContextCompat.getColor(view.context,R.color.green))
                }
            }
        }




    }
}