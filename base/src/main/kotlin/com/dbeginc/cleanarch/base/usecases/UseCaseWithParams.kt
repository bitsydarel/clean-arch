package com.dbeginc.cleanarch.base.usecases

abstract class UseCaseWithParams<in Params, out R> {
    protected abstract fun buildUseCase(params: Params) : R

    fun execute(params: Params): R = buildUseCase(params)
}