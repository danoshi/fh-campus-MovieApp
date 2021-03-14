package com.example.fh_campus_movieapp.collections.movie

import androidx.annotation.Nullable

data class Movie(var title: String = "", var descripton: String = "", var rating: Float, @Nullable var geners: String = "",
var creators: String = "",  var actors: String = "")
