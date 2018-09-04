package com.me.cl.template.presentation.di

import android.content.Context
import com.me.cl.template.presentation.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainActivitySubComponentModule{
    @ContributesAndroidInjector(modules = [MainActivityModule::class,MainActivityFragmentSubComponentModule::class])
    abstract fun mainActivityInjector(): MainActivity
}

@Module
abstract class MainActivityModule{
    @Binds
    abstract fun bindContext(mainActivity: MainActivity): Context
}