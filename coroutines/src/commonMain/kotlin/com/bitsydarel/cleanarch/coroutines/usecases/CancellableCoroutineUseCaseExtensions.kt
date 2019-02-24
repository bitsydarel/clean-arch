package com.bitsydarel.cleanarch.coroutines.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import com.bitsydarel.cleanarch.core.usecases.CancellableUseCase
import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import com.bitsydarel.cleanarch.core.usecases.CancellableUseCaseWithParams
import kotlinx.coroutines.suspendCancellableCoroutine

/**
 * Execute the cancellable use case as a Suspended function.
 *
 * @param params required to execute the use case.
 *
 * @see UseCaseWithParams if cancellation feature is not required.
 *
 * @return [R] of the execution.
 */
suspend fun <Params, R> CancellableUseCaseWithParams<Params, R>.executeAsSuspended(params: Params): R =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation(this::cancel)

        continuation.resumeWith(
            kotlin.runCatching {
                execute(params)
            }
        )
    }

/**
 * Execute the cancellable use case as a Suspended function.
 *
 * @see UseCase if cancellation feature is not required.
 *
 * @return [R] of the execution.
 */
suspend fun <R> CancellableUseCase<R>.executeAsSuspended(): R =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation(this::cancel)

        continuation.resumeWith(
            runCatching(this::execute)
        )
    }

