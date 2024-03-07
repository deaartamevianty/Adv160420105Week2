package com.example.adv160420105week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.adv160420105week2.databinding.FragmentScoreBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ScoreFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ScoreFragment : Fragment() {
    private lateinit var binding: FragmentScoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentScoreBinding.inflate(
            inflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (arguments != null) {
            val playerScore = ScoreFragmentArgs.fromBundle(requireArguments()).playerScore
            binding.txtScore.text = "$playerScore"
        }

        binding.btnBackMenu.setOnClickListener {
            val action = ScoreFragmentDirections.actionMainFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}