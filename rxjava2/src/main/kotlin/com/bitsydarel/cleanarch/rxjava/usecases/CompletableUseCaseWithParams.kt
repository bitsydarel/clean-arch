package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import io.reactivex.CompletableSource

abstract class CompletableUseCaseWithParams<in Params, out R : CompletableSource> : UseCaseWithParams<Params, R>()