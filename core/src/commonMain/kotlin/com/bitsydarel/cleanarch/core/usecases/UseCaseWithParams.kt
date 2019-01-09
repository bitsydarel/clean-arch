package com.bitsydarel.cleanarch.core.usecases

/**
 * Clean architecture Use case.
 *
 * It's orchestrate the flow of data to and from business entities,
 * and direct those entities to use their Critical Business Rules to achieve a goal.
 *
 * [R] represent the result produced by the use case.
 * [Params] represent the parameters of the use case.
 *
 * @see UseCase if the use case does not required parameters.
 */
abstract class UseCaseWithParams<in Params, out R> {
    /**
     * Build the use case to be executed.
     *
     * @param params required to build this use case.
     *
     * @return result [R] of the use case.
     */
    protected abstract fun buildUseCase(params: Params) : R

    /**
     * Execute the use case.
     *
     * Called by client of the use case.
     *
     * @return [R] result of executing this use case
     */
    fun execute(params: Params): R = buildUseCase(params)
}