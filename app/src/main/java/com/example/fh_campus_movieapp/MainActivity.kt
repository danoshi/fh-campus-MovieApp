package com.example.fh_campus_movieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.fh_campus_movieapp.collections.movie.Movie
import com.example.fh_campus_movieapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val movie: Movie = Movie("The Queen's Gambit", "Story\n" +
            "The Queens Gambit is an American coming-of-age drama miniseries created by Scott Frank and Allan Scott.\n" +
            "It is based on the novel by Walter Tevis. The series is a story that explores the true cost of genius.\n" +
            "On January 8, 2021 Netflix released a documentary film named Creating The Queens Gambit.\n" +
            "Abandoned and entrusted to a Kentucky orphanage in the late 1950s,\n" +
            "a young Beth Harmon discovers an astonishing talent for chess while developing an addiction to tranquilizers provided by the state as a sedative for the children.\n" +
            "Haunted by her personal demons and fueled by a cocktail of narcotics and obsession,\n" +
            "Beth transforms into an impressively skilled and glamorous outcast while determined to conquer the traditional boundaries established in the male-dominated world of competitive chess.\n" +
            "On February 3, 2021,\n" +
            "the series was nominated for the 78th annual Golden Globe Awards in 2 categories.\n " +
            "This is one of the most popular openings because of its attacking prowess. White will be attacking and it will be up to black to defend correctly. \n " +
            "If you enjoy putting constant pressure on your opponent, then the queen's gambit is a perfect opening for you.", 4f, "Drama, Sport",
    "Scott Frank, Alan Scott", "Anya Taylor-Joy, Chloe Pirrie")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.movie = movie

        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(this, "Hello User", Toast.LENGTH_SHORT).show()
        }
    }
}