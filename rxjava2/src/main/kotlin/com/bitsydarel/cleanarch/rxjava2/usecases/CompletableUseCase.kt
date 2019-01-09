package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import io.reactivex.CompletableSource

/**
 * RxJava2 Completable use case.
 *
 * Represent use case that do not produce a result but only notify it's completion or failure.
 *
 * [R] completion callback produced by this use case.
 *
 * @see [CompletableUseCaseWithParams] if the use case require parameters.
 */
abstract class CompletableUseCase<out R : CompletableSource> : UseCase<R>()