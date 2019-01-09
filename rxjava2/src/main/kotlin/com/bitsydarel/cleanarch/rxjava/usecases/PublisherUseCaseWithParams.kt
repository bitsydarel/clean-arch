package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCaseWithParams
import org.reactivestreams.Publisher


abstract class PublisherUseCaseWithParams<T, in Params, out R : Publisher<T>> : UseCaseWithParams<Params, R>()