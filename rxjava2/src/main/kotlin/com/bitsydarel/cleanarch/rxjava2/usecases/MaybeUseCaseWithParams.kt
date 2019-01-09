package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import io.reactivex.MaybeSource

/**
 * RxJava2 Maybe use case with parameters (inputs).
 *
 * Represent use case that may or may not produce a result either a failure.
 *
 * [R] maybe callback produced by this use case.
 * [T] type produced by the use case.
 * [Params] required by the use case.
 *
 * @see [MaybeUseCase] if the use case require parameters.
 */
abstract class MaybeUseCaseWithParams<T, in Params, out R : MaybeSource<T>> : UseCaseWithParams<Params, R>()