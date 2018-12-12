package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCaseWithParams
import org.reactivestreams.Publisher


abstract class PublisherUseCaseWithParams<T, in Params, out R : Publisher<T>> : UseCaseWithParams<Params, R>()