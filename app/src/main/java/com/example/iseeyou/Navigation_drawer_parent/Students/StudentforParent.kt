package com.example.iseeyou.Navigation_drawer_parent.Students

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class StudentforParent : Fragment() {

    companion object {
        fun newInstance() = StudentforParent()
    }

    private lateinit var viewModel: StudentforParentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_studentfor_parent, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StudentforParentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}