package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import io.reactivex.SingleSource

/**
 * RxJava2 Single use case.
 *
 * Represent use case that produce a result or failure.
 *
 * [R] single callback produced by this use case.
 * [T] type produced by the use case.
 *
 * @see [SingleUseCaseWithParams] if the use case require parameters.
 */
abstract class SingleUseCase<T, out R : SingleSource<T>> : UseCase<R>()