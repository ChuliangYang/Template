package com.me.cl.template.presentation.ui.base

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.me.cl.template.framework.di.Injectable
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

/**
 * Created by CL on 9/10/18.
 */
open class InjectableFragmentActivity: AppCompatActivity(), HasSupportFragmentInjector, Injectable {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    override fun supportFragmentInjector() =dispatchingAndroidInjector
}