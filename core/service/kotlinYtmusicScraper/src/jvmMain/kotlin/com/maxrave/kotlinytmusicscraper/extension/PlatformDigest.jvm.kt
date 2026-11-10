package com.maxrave.kotlinytmusicscraper.extension

import java.security.MessageDigest

internal actual fun digestSha1(input: ByteArray): ByteArray = MessageDigest.getInstance("SHA-1").digest(input)
internal actual fun digestSha256(input: ByteArray): ByteArray = MessageDigest.getInstance("SHA-256").digest(input)
