package com.bitsydarel.cleanarch.coroutines.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import kotlin.coroutines.suspendCoroutine

/**
 * Execute the use case as a coroutine.
 *
 * @param params required to execute the use case.
 *
 * does not support cancellation.
 *
 * @see executeAsCoroutine if cancellation is needed.
 */
suspend fun <Params, R> UseCaseWithParams<Params, R>.executeAsCoroutine(params: Params): R =
    suspendCoroutine { continuation ->
        continuation.resumeWith(
            kotlin.runCatching {
                execute(params)
            }
        )
    }

suspend fun <R> UseCase<R>.executeAsCoroutine(): R =
    suspendCoroutine { continuation ->
        continuation.resumeWith(
            kotlin.runCatching(this::execute)
        )
    }
