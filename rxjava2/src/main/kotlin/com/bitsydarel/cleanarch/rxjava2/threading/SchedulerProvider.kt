package com.bitsydarel.cleanarch.rxjava2.threading

import com.bitsydarel.cleanarch.core.threading.ThreadManagerProvider
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.Executor

/**
 * Created by darel at 13.12.18.
 *
 * RxJava2 Scheduler provider.
 *
 * Provides commonly used schedulers for rxJava2 based software.
 *
 * @param uiScheduler to be used.
 */
class SchedulerProvider(private val uiScheduler: Scheduler) : ThreadManagerProvider<Scheduler> {
    companion object {
        /**
         * Create RxJava2 Scheduler.
         *
         * @param executor used to create the scheduler.
         *
         * @return [Scheduler] backed by the provided [executor].
         */
        @JvmStatic
        fun fromExecutor(executor: Executor): Scheduler = Schedulers.from(executor)
    }

    /**
     * A elastic RxJava2 Scheduler.
     *
     * @see io if the task is not really that intensive.
     *
     * @return RxJava2 Scheduler [Scheduler] that grow as needed, usually used for resource intensive task.
     */
    override fun elastic(): Scheduler = Schedulers.computation()

    /**
     * A IO (input/output) RxJava2 Scheduler.
     *
     * @see elastic if the task is really intensive and a lot of resources is required.
     *
     * @return RxJava2 Scheduler [Scheduler] that can be used for network call, database call and most of the other use cases.
     */
    override fun io(): Scheduler = Schedulers.io()

    /**
     * A IO (input/output) RxJava2 Scheduler.
     *
     * @see elastic if the task is really intensive and a lot of resources is required.
     *
     * @return RxJava2 Scheduler [Scheduler] that can be used for network call, database call and most of the other use cases.
     */
    override fun ui(): Scheduler = uiScheduler
}