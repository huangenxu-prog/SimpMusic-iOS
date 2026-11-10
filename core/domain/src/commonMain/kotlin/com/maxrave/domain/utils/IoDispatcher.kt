package com.maxrave.domain.utils

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Platform IO dispatcher.
 *
 * JVM and Android use Dispatchers.IO for blocking work. Kotlin/Native uses
 * Dispatchers.Default, which is the supported shared dispatcher on iOS.
 */
internal expect val ioDispatcher: CoroutineDispatcher
