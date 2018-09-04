package com.me.cl.template.framework.data.repo

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

open class RxReopsitory: BaseRepository(), ClearableRepository {
    val compositeDisposable: CompositeDisposable = CompositeDisposable()

    private fun clearDisposables() {
        compositeDisposable.clear()
    }

    override fun clear() {
        clearDisposables()
    }
}

inline fun RxReopsitory.autoDispose(disposable: Disposable){
    compositeDisposable.add(disposable)
}