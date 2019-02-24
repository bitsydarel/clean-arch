package com.bitsydarel.cleanarch.coroutines.threading

import com.bitsydarel.cleanarch.core.threading.ThreadManagerProvider
import kotlinx.coroutines.CoroutineDispatcher

/**
 * Coroutine Dispatcher Provider.
 */
expect class DispatcherProvider : ThreadManagerProvider<CoroutineDispatcher> {
    override fun elastic(): CoroutineDispatcher

    override fun io(): CoroutineDispatcher

    override fun ui(): CoroutineDispatcher
}