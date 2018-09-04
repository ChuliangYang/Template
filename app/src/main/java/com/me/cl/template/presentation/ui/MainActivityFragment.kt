package com.me.cl.template.presentation.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.me.cl.template.R
import com.me.cl.template.framework.di.Injectable

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment(), Injectable {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    companion object {
        val Tag=this::class.toString()
        fun newInstance(): MainActivityFragment {
            return MainActivityFragment().apply {
               Bundle().apply {

               }.let {
                   arguments=it
               }
            }
        }
    }
}
