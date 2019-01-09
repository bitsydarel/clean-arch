package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import io.reactivex.MaybeSource

abstract class MaybeUseCase<T, out R : MaybeSource<T>> : UseCase<R>()