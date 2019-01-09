package com.bitsydarel.cleanarch.core.usecases

/**
 * Cancellable use case, represent a use case that can be cancelled.
 *
 * type [R] represent the return type of this use case.
 *
 * type [Params] represent the parameter type of this use case.
 */
abstract class CancellableUseCaseWithParams<in Params, out R> : UseCaseWithParams<Params, R>() {
    /**
     * Cancel the use case.
     *
     * Calling this method does not guarantee that the use case has been cancelled.
     */
    abstract fun cancel()
}