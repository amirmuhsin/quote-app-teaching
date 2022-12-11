package com.amirmuhsin.template.view.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.amirmuhsin.template.R

class ScreenSlidePageFragment2: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View= inflater.inflate(R.layout.fragment_screen_slide2,container,false)
}