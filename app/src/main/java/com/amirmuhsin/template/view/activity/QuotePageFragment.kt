package com.amirmuhsin.template.view.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.amirmuhsin.template.R

class QuotePageFragment : Fragment() {

    private lateinit var tvQuote: TextView
    private lateinit var tvAuthor: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_quote_page, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvQuote = view.findViewById(R.id.tvQuote)
        tvAuthor = view.findViewById(R.id.tvAuthor)
    }
}