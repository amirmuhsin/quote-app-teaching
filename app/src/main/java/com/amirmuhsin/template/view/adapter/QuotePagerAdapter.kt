package com.amirmuhsin.template.view.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amirmuhsin.template.data.model.Quote
import com.amirmuhsin.template.view.activity.QuotePageLayout

class QuotePagerAdapter(val quoteList: List<Quote>) : RecyclerView.Adapter<QuotePagerAdapter.QuotePageViewHolder>() {

    // ekranga nechta cup sig'sa o'shancha chaqirilinadi
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuotePageViewHolder {
        return QuotePageViewHolder(QuotePageLayout(parent.context))
    }

    // data modelimiz nechta bo'lsa, o'shancha kiradi. In other word: `getItemCount()` nechini bersa, o'shancha shu method ishga tushadi
    override fun onBindViewHolder(cup: QuotePageViewHolder, position: Int) {
        val quote = quoteList[position]
        cup.layout.populateData(quote)
    }

    override fun getItemCount(): Int = quoteList.size

    inner class QuotePageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val layout = itemView as QuotePageLayout

    }

}