package com.me.cl.template.presentation.di

import com.me.cl.template.framework.di.PerFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class CityListFragmentSubComponentModule{
    @PerFragment
    @ContributesAndroidInjector(modules = [CityListFragmentModule::class])
    abstract fun cityListFragmentInjector():CityListFragment
}

@Module
abstract class CityListFragmentModule{

}