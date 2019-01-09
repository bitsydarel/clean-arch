package com.bitsydarel.cleanarch.core.usecases

abstract class UseCase<out R> {
    protected abstract fun buildUseCase() : R

    fun execute(): R = buildUseCase()
}