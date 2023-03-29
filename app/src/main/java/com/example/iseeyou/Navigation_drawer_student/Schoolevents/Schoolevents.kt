package com.example.iseeyou.Navigation_drawer_student.Schoolevents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class Schoolevents : Fragment() {

    companion object {
        fun newInstance() = Schoolevents()
    }

    private lateinit var viewModel: SchooleventsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_schoolevents_student, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SchooleventsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}