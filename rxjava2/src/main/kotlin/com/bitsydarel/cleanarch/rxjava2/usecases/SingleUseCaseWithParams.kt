package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import io.reactivex.SingleSource

/**
 * RxJava2 Single use case with parameters (inputs).
 *
 * Represent use case that produce a result or failure.
 *
 * [R] single callback produced by this use case.
 * [T] type produced by the use case.
 * [Params] required by the use case.
 *
 * @see [SingleUseCase] if the use case require parameters.
 */
abstract class SingleUseCaseWithParams<T, in Params, out R : SingleSource<T>> : UseCaseWithParams<Params, R>()