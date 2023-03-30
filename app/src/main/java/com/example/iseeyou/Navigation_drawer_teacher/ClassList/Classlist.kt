package com.example.iseeyou.Navigation_drawer_teacher.ClassList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class Classlist : Fragment() {

    companion object {
        fun newInstance() = Classlist()
    }

    private lateinit var viewModel: ClasslistViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_classlist_teacher, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ClasslistViewModel::class.java)
        // TODO: Use the ViewModel
    }

}