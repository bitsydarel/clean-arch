package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import org.reactivestreams.Publisher

/**
 * RxJava2 Publisher use case with parameters (inputs).
 *
 * Represent use case that may produce one or more results either a failure.
 *
 * [R] Publisher callback produced by this use case.
 * [T] type produced by the use case.
 * [Params] required by the use case.
 *
 * @see [PublisherUseCase] if the use case require parameters.
 */
abstract class PublisherUseCaseWithParams<T, in Params, out R : Publisher<T>> : UseCaseWithParams<Params, R>()