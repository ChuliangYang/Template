package com.me.cl.template.framework.data

import android.arch.lifecycle.LiveData

class EmptyLiveData<T : Any?> private constructor() : LiveData<T>() {
    init {
        // use post instead of set since this can be created on any thread
        postValue(null)
    }

    companion object {
        fun <T> create(): LiveData<T> {
            return EmptyLiveData()
        }
    }
}