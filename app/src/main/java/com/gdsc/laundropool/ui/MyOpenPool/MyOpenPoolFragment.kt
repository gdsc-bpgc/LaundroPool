package com.gdsc.laundropool.ui.MyOpenPool

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gdsc.laundropool.R

class MyOpenPoolFragment : Fragment() {

    companion object {
        fun newInstance() = MyOpenPoolFragment()
    }

    private lateinit var viewModel: MyOpenPoolViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.my_open_pool_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MyOpenPoolViewModel::class.java)
        // TODO: Use the ViewModel
    }

}