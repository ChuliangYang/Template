package com.me.cl.template.presentation.ui

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.me.cl.template.R
import com.me.cl.template.framework.di.Injectable
import javax.inject.Inject


class MainActivityFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(CityListViewModel::class.java)
//        viewModel.getTitle().observe(this, Observer {
//            titlebar.title = it?.original
//        })

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
