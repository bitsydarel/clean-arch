package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCaseWithParams
import io.reactivex.MaybeSource

abstract class MaybeUseCaseWithParams<T, in Params, out R : MaybeSource<T>> : UseCaseWithParams<Params, R>()