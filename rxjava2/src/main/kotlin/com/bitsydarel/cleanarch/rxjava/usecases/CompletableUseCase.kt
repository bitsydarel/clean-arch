package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import io.reactivex.CompletableSource

abstract class CompletableUseCase<out R : CompletableSource> : UseCase<R>()