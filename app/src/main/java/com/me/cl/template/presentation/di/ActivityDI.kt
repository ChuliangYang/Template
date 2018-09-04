package com.me.cl.template.presentation.di

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainActivitySubComponentModule{
    @ContributesAndroidInjector(modules = [MainActivityMVVMModule::class,CityListFragmentSubComponentModule::class])
    abstract fun mainActivityInjector(): MainActivityMVVM
}

@Module
abstract class MainActivityMVVMModule