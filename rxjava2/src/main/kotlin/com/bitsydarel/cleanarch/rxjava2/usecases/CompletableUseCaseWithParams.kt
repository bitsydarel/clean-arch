package com.bitsydarel.cleanarch.rxjava2.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import io.reactivex.CompletableSource

/**
 * RxJava2 Completable use case with parameters (inputs).
 *
 * Represent use case that do not produce a result but only notify it's completion or failure.
 *
 * [R] completion callback produced by this use case.
 * [Params] required by the use case.
 */
abstract class CompletableUseCaseWithParams<in Params, out R : CompletableSource> : UseCaseWithParams<Params, R>()