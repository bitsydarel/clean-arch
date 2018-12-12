package com.dbeginc.cleanarch.base.usecases

abstract class CancellableUseCase<out R> : UseCase<R>() {
    abstract fun cancel()
}