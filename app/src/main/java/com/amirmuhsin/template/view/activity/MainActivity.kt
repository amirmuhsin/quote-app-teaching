package com.amirmuhsin.template.view.activity

import androidx.viewpager2.widget.ViewPager2
import com.amirmuhsin.template.R
import com.amirmuhsin.template.data.model.Quote
import com.amirmuhsin.template.databinding.ActivityMainBinding
import com.amirmuhsin.template.view.adapter.QuotePagerAdapter
import com.amirmuhsin.template.view.base.BaseActivityTemporary

class MainActivity : BaseActivityTemporary<ActivityMainBinding>(
    ActivityMainBinding::inflate
) {

    private val quoteList = arrayListOf(
        Quote(1, "Birinchi Quote", "Mirmuhsin"),
        Quote(2, "Ikkinchi Quote", "Ibrohim"),
        Quote(3, "Uchinchi Quote", "Najimxon"),
        Quote(4, "Tortinchi Quote", "Ibrohim"),
        Quote(5, "Beshinchi Quote", "Mirmuhsin"),
        Quote(6, "OLdtinci Quote", "Ibrohim"),
        Quote(7, "Yettinghic Quote", "Najimxon"),
        Quote(8, "Sakkingizin Quote", "Ibrohim"),
        Quote(9, "Toqqincih Quote", "Najimxon"),
        Quote(10, "Onchicnichi Quote", "Ibrohim"),
    )

    private lateinit var viewPager: ViewPager2
    private lateinit var pagerAdapter: QuotePagerAdapter

    override fun assignObjects() {
        viewPager = findViewById(R.id.viewPager2)
        pagerAdapter = QuotePagerAdapter(quoteList.shuffled())
    }

    override fun prepareUI() {
        viewPager.adapter = pagerAdapter
        viewPager.setCurrentItem(QuotePagerAdapter.FAKE_INFINITY_SIZE / 2, false)
    }

    override fun onBackPressed() {
        if (viewPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            viewPager.currentItem = viewPager.currentItem - 1
        }
    }
}