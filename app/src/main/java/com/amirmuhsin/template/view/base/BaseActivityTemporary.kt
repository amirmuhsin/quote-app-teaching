package com.amirmuhsin.template.view.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

typealias SingleInflateTempo<T> = (LayoutInflater) -> T

abstract class BaseActivityTemporary<VB : ViewBinding>(
    private val inflate: SingleInflateTempo<VB>
) : AppCompatActivity() {

    protected lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate.invoke(layoutInflater)
        setContentView(binding.root)

        assignObjects()
        setListeners()
        prepareUI()
        setObservers()
    }

    protected open fun assignObjects() {}
    protected open fun setListeners() {}
    protected open fun prepareUI() {}
    protected open fun setObservers() {}

}