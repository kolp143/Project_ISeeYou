package com.example.iseeyou.Navigation_drawer_student.Announcement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class StudentAnnoucement : Fragment() {

    companion object {
        fun newInstance() = StudentAnnoucement()
    }

    private lateinit var viewModel: StudentAnnoucementViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_annoucement, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StudentAnnoucementViewModel::class.java)
        // TODO: Use the ViewModel
    }

}