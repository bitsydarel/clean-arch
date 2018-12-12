package com.dbeginc.cleanarch.rxjava.threading

import com.dbeginc.cleanarch.base.threading.ThreadManagerProvider
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Executor

/**
 * Created by darel at 13.12.18.
 */
class SchedulerProvider(private val uiScheduler: Scheduler) : ThreadManagerProvider<Scheduler> {
    companion object {
        @JvmStatic
        fun fromExecutor(executor: Executor) = Schedulers.from(executor)
    }

    override fun elastic(): Scheduler = Schedulers.computation()

    override fun io(): Scheduler = Schedulers.io()

    override fun ui(): Scheduler = uiScheduler
}