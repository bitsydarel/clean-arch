package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCase
import io.reactivex.SingleSource

abstract class SingleUseCase<T, out R : SingleSource<T>> : UseCase<R>()