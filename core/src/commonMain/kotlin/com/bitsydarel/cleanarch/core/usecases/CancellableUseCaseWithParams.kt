package com.bitsydarel.cleanarch.core.usecases

abstract class CancellableUseCaseWithParams<in Params, out R> : UseCaseWithParams<Params, R>() {
    abstract fun cancel()
}