package com.bitsydarel.cleanarch.coroutines.threading

import com.bitsydarel.cleanarch.core.threading.ThreadManagerProvider
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Coroutine Dispatcher Provider.
 *
 * @param userInterfaceDispatcher to delegate task to be run on ui thread.
 *
 * The [userInterfaceDispatcher] can be provided for every platform.
 * Example JavaFx, Android UI Thread, ect.
 */
actual class DispatcherProvider(
    private val userInterfaceDispatcher: CoroutineDispatcher
) : ThreadManagerProvider<CoroutineDispatcher> {
    actual override fun elastic(): CoroutineDispatcher = Dispatchers.Default

    actual override fun io(): CoroutineDispatcher = Dispatchers.IO

    actual override fun ui(): CoroutineDispatcher = userInterfaceDispatcher

}