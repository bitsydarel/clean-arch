package com.bitsydarel.cleanarch.core.threading

/**
 * Created by darel at 13.12.18.
 *
 * Thread Manager interface that provide method to get different type thread manager for different needs.
 */
interface ThreadManagerProvider<out T> {
    /**
     * A elastic Thread Manager.
     *
     * @return Thread Manager of type [T] that grow as needed, usually used for graphic intensive task.
     * @see io if the task is not really that intensive.
     */
    fun elastic(): T

    /**
     * A IO (input/output) Thread Manager.
     *
     * @return Thread Manager of type [T] that can be used for network call, database call and most of the other use cases.
     * @see elastic if the task is really intensive and a lot of resources is available.
     */
    fun io(): T

    /**
     * A UI scheduler.
     *
     * This scheduler should not run long running operations.
     *
     * @return Thread Manager of type [T] that can be used for drawing task on the input device or screen or for really lightly tasks.
     * @see io if the task to be scheduled might take time to finish or if it's intensive.
     */
    fun ui(): T
}