package com.dbeginc.cleanarch.rxjava.usecases

import com.dbeginc.cleanarch.base.usecases.UseCase
import org.reactivestreams.Publisher


abstract class PublisherUseCase<T, out R : Publisher<T>> : UseCase<R>()