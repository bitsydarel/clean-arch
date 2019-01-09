package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import io.reactivex.MaybeSource

abstract class MaybeUseCaseWithParams<T, in Params, out R : MaybeSource<T>> : UseCaseWithParams<Params, R>()