package com.example.iseeyou.Navigation_drawer_teacher.StudentViolations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class StudentViolation : Fragment() {

    companion object {
        fun newInstance() = StudentViolation()
    }

    private lateinit var viewModel: StudentViolationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_studentviolation_teacher, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StudentViolationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}