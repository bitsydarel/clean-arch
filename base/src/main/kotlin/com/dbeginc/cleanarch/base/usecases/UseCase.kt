package com.dbeginc.cleanarch.base.usecases

abstract class UseCase<out R> {
    protected abstract fun buildUseCase() : R

    fun execute(): R = buildUseCase()
}