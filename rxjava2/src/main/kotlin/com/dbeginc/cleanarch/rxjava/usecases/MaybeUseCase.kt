package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCase
import io.reactivex.MaybeSource

abstract class MaybeUseCase<T, out R : MaybeSource<T>> : UseCase<R>()