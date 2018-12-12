package com.dbeginc.cleanarch.base.usecases

abstract class CancellableUseCaseWithParams<in Params, out R> : UseCaseWithParams<Params, R>() {
    abstract fun cancel()
}