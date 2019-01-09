package com.bitsydarel.cleanarch.core.usecases

/**
 * Clean architecture Use case.
 *
 * It's orchestrate the flow of data to and from business entities,
 * and direct those entities to use their Critical Business Rules to achieve a goal.
 *
 * [R] represent the result produced by this use case.
 *
 * @see UseCaseWithParams if the use case require parameters.
 */
abstract class UseCase<out R> {
    /**
     * Build the use case to be executed.
     *
     * @return result [R] of the use case.
     */
    protected abstract fun buildUseCase() : R

    /**
     * Execute the use case.
     *
     * Called by client of the use case.
     *
     * @return [R] result of executing this use case
     */
    fun execute(): R = buildUseCase()
}