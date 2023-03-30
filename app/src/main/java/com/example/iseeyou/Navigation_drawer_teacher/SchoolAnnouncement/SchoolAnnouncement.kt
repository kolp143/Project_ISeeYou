package com.example.iseeyou.Navigation_drawer_teacher.SchoolAnnouncement

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.iseeyou.R

class SchoolAnnouncement : Fragment() {

    companion object {
        fun newInstance() = SchoolAnnouncement()
    }

    private lateinit var viewModel: SchoolAnnouncementViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_schoolannouncement_teacher, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SchoolAnnouncementViewModel::class.java)
        // TODO: Use the ViewModel
    }

}