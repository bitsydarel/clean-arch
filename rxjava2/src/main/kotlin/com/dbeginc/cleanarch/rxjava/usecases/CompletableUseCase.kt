package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCase
import io.reactivex.CompletableSource

abstract class CompletableUseCase<out R : CompletableSource> : UseCase<R>()