package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import io.reactivex.MaybeSource

/**
 * RxJava2 Maybe use case.
 *
 * Represent use case that may or may not produce a result either a failure.
 *
 * [R] maybe callback produced by this use case.
 * [T] type produced by the use case.
 *
 * @see [MaybeUseCaseWithParams] if the use case require parameters.
 */
abstract class MaybeUseCase<T, out R : MaybeSource<T>> : UseCase<R>()