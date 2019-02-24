package com.bitsydarel.cleanarch.coroutines.threading

import com.bitsydarel.cleanarch.core.threading.ThreadManagerProvider
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Coroutine Dispatcher Provider.
 *
 * Since Javascript it's a single threaded platform, every method return the same Dispatcher.
 */
actual class DispatcherProvider : ThreadManagerProvider<CoroutineDispatcher> {
    actual override fun elastic(): CoroutineDispatcher = Dispatchers.Default

    actual override fun io(): CoroutineDispatcher = Dispatchers.Default

    actual override fun ui(): CoroutineDispatcher = Dispatchers.Default
}