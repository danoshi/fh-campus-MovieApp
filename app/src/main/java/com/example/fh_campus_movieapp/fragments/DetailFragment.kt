package com.example.fh_campus_movieapp.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.fh_campus_movieapp.R
import com.example.fh_campus_movieapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = DataBindingUtil.inflate<FragmentDetailBinding>(
            inflater,
            R.layout.fragment_detail,
            container,
            false
        )

        binding.movie = DetailFragmentArgs.fromBundle(requireArguments()).movie

        binding.floatingActionButton.setOnClickListener {
            Toast.makeText(
                activity,
                "Juhuuu",
                Toast.LENGTH_SHORT
            ).show()
        }
        return binding.root

    }

}