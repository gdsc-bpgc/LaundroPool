package com.gdsc.laundropool.ui.PastPools

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gdsc.laundropool.R

class PastPoolsFragment : Fragment() {

    companion object {
        fun newInstance() = PastPoolsFragment()
    }

    private lateinit var viewModel: PastPoolsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.past_pools_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PastPoolsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}