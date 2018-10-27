package com.me.cl.template.framework.data.transform

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.support.annotation.WorkerThread
import com.me.cl.template.framework.data.DataResource
import com.me.cl.template.framework.data.remote.NetworkResponse
import com.me.cl.template.framework.data.remote.ResponseFailed
import com.me.cl.template.framework.data.remote.ResponseSuccess
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

object ReactUtil {

    @WorkerThread
    fun <T> toLiveDataResource(dataProducer: () -> T?): LiveData<DataResource<T>> {
        val temp = MutableLiveData<DataResource<T>>()
        Single.create<DataResource<T>> {
            it.onSuccess(DataResource.success(dataProducer()))
        }.subscribeOn(Schedulers.computation()).subscribe { t1, t2 ->
            t1.original?.let{
                temp.postValue(t1)
            }?:let{
                temp.postValue(DataResource.Absent())
            }
        }
        return temp
    }

    fun <T> toLiveDataResource(data: T?): LiveData<DataResource<T>> {
        val temp = MutableLiveData<DataResource<T>>()
        if (data == null) {
            temp.postValue(DataResource.Absent())
        } else {
            temp.postValue(DataResource.success(data))
        }
        return temp
    }

    fun <T> toLiveDataResource(data:LiveData<T?>):LiveData<DataResource<T>>{
        return Transformations.map(data) {
            it?.let {
                DataResource.success(it)
            }?:let {
                DataResource.Absent<T>()
            }
        }
    }

    fun <T> remoteToLiveDataResource(data:LiveData<NetworkResponse<T>>):LiveData<DataResource<T>>{
        return Transformations.map(data) {
            when(it){
                is ResponseSuccess ->{
                    DataResource.success(it.result)
                }
                is ResponseFailed ->{
                    DataResource.failed(it.errorMessage)
                }

                else->{
                    DataResource.failed("unknow error")
                }
            }
        }
    }
}