package com.amirmuhsin.template.view.activity

import com.amirmuhsin.template.databinding.ActivityMainBinding
import com.amirmuhsin.template.view.base.BaseActivity
import com.amirmuhsin.template.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(ActivityMainBinding::inflate) {

    override fun viewModelClass() = MainViewModel::class.java

}