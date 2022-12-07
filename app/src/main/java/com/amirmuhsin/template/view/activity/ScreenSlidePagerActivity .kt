package com.amirmuhsin.template.view.activity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

import androidx.viewpager2.adapter.FragmentStateAdapter

private const val NUM_PAGES=5

class ScreenSlidePagerActivity:FragmentActivity(){


    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_slide)

        viewPager=findViewById(R.id.pager)

        val pagerAdapter=ScreenSlidePageFragment(this)
        viewPager.adapter=pagerAdapter
    }

    override fun onBackPressed() {
        if (viewPager.currentItem==0){
        super.onBackPressed()
    }else{
        viewPager.currentItem=viewPager.currentItem-1
        }
}
    private inner class ScreenSlidePageAdapter(fa:FragmentActivity):FragmentStateAdapter(fa){
    override fun getItemCount():Int= NUM_PAGES

    override fun createFragment(position:Int): Fragment =ScreenSlidePageFragment()}
}