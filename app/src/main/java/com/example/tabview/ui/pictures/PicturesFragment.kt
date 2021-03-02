package com.example.tabview.ui.pictures

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tabview.R

class PicturesFragment : Fragment() {

    private lateinit var picturesViewModel: PicturesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        picturesViewModel = ViewModelProvider(this).get(PicturesViewModel::class.java)
        return inflater.inflate(R.layout.pictures_fragment, container, false)
    }

}