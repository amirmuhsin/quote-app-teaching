package com.amirmuhsin.template.view.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding

typealias SingleInflate<T> = (LayoutInflater) -> T

abstract class BaseActivity<VB : ViewBinding, VM : ViewModel>(
    private val inflate: SingleInflate<VB>
) : AppCompatActivity() {

    protected lateinit var binding: VB
    protected lateinit var viewModel: VM

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupSplashScreen()

        binding = inflate.invoke(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[viewModelClass()]

        assignObjects()
        setListeners()
        prepareUI()
        setObservers()
    }

    protected open fun setupSplashScreen() {}
    protected abstract fun viewModelClass(): Class<VM>
    protected open fun assignObjects() {}
    protected open fun setListeners() {}
    protected open fun prepareUI() {}
    protected open fun setObservers() {}

}