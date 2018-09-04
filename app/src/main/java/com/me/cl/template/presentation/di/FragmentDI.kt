package com.me.cl.template.presentation.di

import com.me.cl.template.framework.di.PerFragment
import com.me.cl.template.presentation.ui.MainActivityFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainActivityFragmentSubComponentModule{
    @PerFragment
    @ContributesAndroidInjector(modules = [MainActivityFragmentModule::class])
    abstract fun cityListFragmentInjector(): MainActivityFragment
}

@Module
abstract class MainActivityFragmentModule{

}