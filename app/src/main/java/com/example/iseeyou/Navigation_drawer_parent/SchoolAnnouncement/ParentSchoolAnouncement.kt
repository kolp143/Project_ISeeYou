package com.example.iseeyou.Navigation_drawer_parent.SchoolAnnouncement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.iseeyou.R

class ParentSchoolAnouncement : Fragment() {

    companion object {
        fun newInstance() = ParentSchoolAnouncement()
    }

    private lateinit var viewModel: ParentSchoolAnouncementViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_parent_school_anouncement, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ParentSchoolAnouncementViewModel::class.java)
        // TODO: Use the ViewModel
    }

}