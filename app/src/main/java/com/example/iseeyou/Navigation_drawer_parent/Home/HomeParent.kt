package com.example.iseeyou.Navigation_drawer_parent.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class HomeParent : Fragment() {

    companion object {
        fun newInstance() = HomeParent()
    }

    private lateinit var viewModel: HomeParentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home_parent, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeParentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}