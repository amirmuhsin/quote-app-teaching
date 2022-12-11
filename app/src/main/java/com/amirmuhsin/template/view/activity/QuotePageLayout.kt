package com.amirmuhsin.template.view.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.RelativeLayout
import android.widget.TextView
import com.amirmuhsin.template.R
import com.amirmuhsin.template.data.model.Quote

class QuotePageLayout(context: Context) : RelativeLayout(context) {

    private val fakeRoot = LayoutInflater.from(context).inflate(R.layout.layout_page_quote, this)

    private val tvAuthor: TextView = fakeRoot.findViewById(R.id.tvAuthor)
    private val tvQuote: TextView = fakeRoot.findViewById(R.id.tvQuote)

    init {
        layoutParams = LayoutParams(MATCH_PARENT, MATCH_PARENT)
    }

    fun populateData(quote: Quote) {
        tvQuote.text = quote.text
        tvAuthor.text = quote.author
    }

}