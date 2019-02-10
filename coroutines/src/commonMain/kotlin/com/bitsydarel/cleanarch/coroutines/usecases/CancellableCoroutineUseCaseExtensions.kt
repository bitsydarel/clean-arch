package com.bitsydarel.cleanarch.coroutines.usecases

import com.bitsydarel.cleanarch.core.usecases.CancellableUseCase
import com.bitsydarel.cleanarch.core.usecases.CancellableUseCaseWithParams
import kotlinx.coroutines.suspendCancellableCoroutine

suspend fun <Params, R> CancellableUseCaseWithParams<Params, R>.executeAsCoroutine(params: Params): R =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation(this::cancel)

        continuation.resumeWith(
            kotlin.runCatching {
                execute(params)
            }
        )
    }

suspend fun <R> CancellableUseCase<R>.executeAsCoroutine(): R =
    suspendCancellableCoroutine { continuation ->
        continuation.invokeOnCancellation(this::cancel)

        continuation.resumeWith(
            runCatching(this::execute)
        )
    }

