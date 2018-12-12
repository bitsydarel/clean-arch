package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCaseWithParams
import io.reactivex.CompletableSource

abstract class CompletableUseCaseWithParams<in Params, out R : CompletableSource> : UseCaseWithParams<Params, R>()