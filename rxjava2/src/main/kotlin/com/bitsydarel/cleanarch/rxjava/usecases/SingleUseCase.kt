package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import io.reactivex.SingleSource

abstract class SingleUseCase<T, out R : SingleSource<T>> : UseCase<R>()