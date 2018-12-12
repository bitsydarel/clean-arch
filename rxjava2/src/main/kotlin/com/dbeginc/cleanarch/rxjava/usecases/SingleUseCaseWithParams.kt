package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCaseWithParams
import io.reactivex.SingleSource

abstract class SingleUseCaseWithParams<T, in Params, out R : SingleSource<T>> : UseCaseWithParams<Params, R>()