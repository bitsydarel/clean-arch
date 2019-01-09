package com.bitsydarel.cleanarch.rxjava.usecases

import com.bitsydarel.cleanarch.core.usecases.UseCase
import org.reactivestreams.Publisher


abstract class PublisherUseCase<T, out R : Publisher<T>> : UseCase<R>()