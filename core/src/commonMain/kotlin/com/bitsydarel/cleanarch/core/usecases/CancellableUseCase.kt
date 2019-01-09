package com.bitsydarel.cleanarch.core.usecases

abstract class CancellableUseCase<out R> : UseCase<R>() {
    abstract fun cancel()
}