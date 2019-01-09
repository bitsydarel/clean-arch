package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import org.reactivestreams.Publisher

/**
 * RxJava2 Publisher use case.
 *
 * Represent use case that may produce one or more results either a failure.
 *
 * [R] Publisher callback produced by this use case.
 * [T] type produced by the use case.
 *
 * @see [PublisherUseCaseWithParams] if the use case require parameters.
 */
abstract class PublisherUseCase<T, out R : Publisher<T>> : UseCase<R>()