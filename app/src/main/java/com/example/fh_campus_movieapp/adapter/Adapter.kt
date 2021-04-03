package com.example.fh_campus_movieapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fh_campus_movieapp.R
import com.example.fh_campus_movieapp.collections.movie.Movie
import com.example.fh_campus_movieapp.fragments.HomeFragmentDirections


class Adapter : RecyclerView.Adapter<Adapter.ViewHolder>(){
    private val movie1: Movie = Movie(
        title = "The Queen's Gambit",
        descripton = "The Queen\'s Gambit follows the life of an orphan chess prodigy," +
                "Elizabeth Harmon, during her quest to become the world\'s greatest " +
                "chess player while struggling with emotional problems and drug and " +
                "alcohol dependency. The title of the series refers to a chess opening " +
                "of the same name. The story begins in the mid-1950s and proceeds into the 1960s. " +
                "The story begins in Lexington, Kentucky, where a nine-year-old Beth, having lost her " +
                "mother in a car crash, is taken to an orphanage where she is taught chess by the " +
                "building\'s custodian, Mr. Shaibel. As was common during the 1950s, the orphanage " +
                "dispenses daily tranquilizer pills to the girls, which turns into an addiction " +
                "for Beth. She quickly becomes a strong chess player due to her visualization skills, " +
                "which are enhanced by the tranquilizers. A few years later, Beth is adopted by Alma Wheatley " +
                "and her husband from Lexington. As she adjusts to her new home, Beth enters a chess tournament and " +
                "wins despite having no prior experience in competitive chess. She develops friendships with several people, " +
                "including former Kentucky State Champion Harry Beltik, United States National Champion Benny Watts, and journalist " +
                "and fellow player D.L. Townes. As Beth rises to the top of the chess world and reaps the financial benefits of her " +
                "success, her drug and alcohol dependency becomes worse.",
        rating = 4.5F,
        geners = listOf("Drama", "Sport"),
        creators = listOf("Scott Frank", "Alan Scott"),
        actors = listOf("Anya Taylor-Joy", "Chloe Pirrie"),
    )

    private val movies = arrayOf(movie1)
    private val titles = arrayOf(movie1.title, )
    private val creators = arrayOf(movie1.creators)
    private val actors = arrayOf(movie1.actors)


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var cTitle: TextView = itemView.findViewById(R.id.title_card1)
        var cCreators: TextView = itemView.findViewById(R.id.creators_card1)
        var cActors: TextView = itemView.findViewById(R.id.actors_card1)
        var cButton: Button = itemView.findViewById(R.id.detailButton1)

    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.custom_view, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.cTitle.text = titles[position]
        viewHolder.cCreators.text = creators[position].toString()
        viewHolder.cActors.text = actors[position].toString()
        viewHolder.cButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailFragment(movies[position])
                )
        }

    }


    override fun getItemCount(): Int {
        return titles.size
    }

}