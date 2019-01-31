package com.bitsydarel.cleanarch.coroutines.threading

import com.bitsydarel.cleanarch.core.threading.ThreadManagerProvider
import kotlinx.coroutines.Dispatchers

class DispatcherProvider : ThreadManagerProvider<CoroutineDispatcher> {
    override fun elastic(): CoroutineDispatcher = Dispatchers.Default

    override fun io(): CoroutineDispatcher = Dispatchers.Default

    override fun ui(): CoroutineDispatcher = Dispatchers.Default
}