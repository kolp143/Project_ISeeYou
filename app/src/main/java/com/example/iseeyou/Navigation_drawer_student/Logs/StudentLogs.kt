package com.example.iseeyou.Navigation_drawer_student.Logs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class StudentLogs : Fragment() {

    companion object {
        fun newInstance() = StudentLogs()
    }

    private lateinit var viewModel: StudentLogsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_logs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(StudentLogsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}