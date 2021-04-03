package com.example.fh_campus_movieapp.collections.movie

import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.io.Serializable

@BindingAdapter("android:text")
fun setText(view: TextView, list: List<String>) {
    view.text = list.joinToString(", ")
}

data class Movie(var title: String = "",
                 var descripton: String = "",
                 var rating: Float,
                 var geners: List<String>? = null,
                 var creators: List<String> = emptyList(),
                 var actors: List<String> = emptyList()):Serializable
