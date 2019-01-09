package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import io.reactivex.SingleSource

abstract class SingleUseCaseWithParams<T, in Params, out R : SingleSource<T>> : UseCaseWithParams<Params, R>()