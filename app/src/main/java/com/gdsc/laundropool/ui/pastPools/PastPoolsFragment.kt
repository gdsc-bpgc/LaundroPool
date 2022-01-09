package com.gdsc.laundropool.ui.pastPools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.gdsc.laundropool.databinding.PastPoolsFragmentBinding

class PastPoolsFragment : Fragment() {

    private var _binding: PastPoolsFragmentBinding? = null

    private val binding
        get() = _binding!!

    private val viewModel: PastPoolsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = PastPoolsFragmentBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

}