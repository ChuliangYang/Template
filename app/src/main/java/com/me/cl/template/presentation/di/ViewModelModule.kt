package com.me.cl.template.presentation.di

import android.arch.lifecycle.ViewModelProvider
import com.me.cl.template.framework.viewmodel.MyViewModelFactory
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Suppress("unused")
@Module
abstract class ViewModelModule{
//    @Binds
//    @IntoMap
//    @ViewModelKey(CityListViewModel::class)
//    abstract fun bindCityListViewModel(cityViewModel:CityListViewModel): ViewModel

    @Singleton
    @Binds
    abstract fun bindViewModelFactory(factory: MyViewModelFactory): ViewModelProvider.Factory


    @Module
    companion object {
//        @JvmStatic
//        @Provides
//        fun provideCityDao(dataBase:AppDatabase): CityDao{
//            return dataBase.cityDao()
//        }
    }
}