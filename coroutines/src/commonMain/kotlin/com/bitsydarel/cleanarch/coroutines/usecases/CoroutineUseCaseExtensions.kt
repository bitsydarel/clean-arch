package com.bitsydarel.cleanarch.coroutines.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import com.bitsydarel.cleanarch.core.usecases.CancellableUseCase
import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import com.bitsydarel.cleanarch.core.usecases.CancellableUseCaseWithParams
import kotlin.coroutines.suspendCoroutine

/**
 * Execute the use case as a Suspended function.
 *
 * @param params required to execute the use case.
 *
 * does not support cancellation.
 *
 * @see CancellableUseCaseWithParams if cancellation feature required.
 *
 * @return [R] of the execution.
 */
suspend fun <Params, R> UseCaseWithParams<Params, R>.executeAsSuspended(params: Params): R =
    suspendCoroutine { continuation ->
        continuation.resumeWith(
            kotlin.runCatching {
                execute(params)
            }
        )
    }

/**
 * Execute the use case as a Suspended function.
 *
 * does not support cancellation.
 *
 * @see CancellableUseCase if cancellation feature required.
 *
 * @return [R] of the execution.
 */
suspend fun <R> UseCase<R>.executeAsSuspended(): R =
    suspendCoroutine { continuation ->
        continuation.resumeWith(
            kotlin.runCatching(this::execute)
        )
    }
