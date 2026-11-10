package com.maxrave.kotlinytmusicscraper.extension

import kotlinx.cinterop.addressOf
import kotlinx.cinterop.convert
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.usePinned
import platform.CommonCrypto.CC_SHA1
import platform.CommonCrypto.CC_SHA1_DIGEST_LENGTH
import platform.CommonCrypto.CC_SHA256
import platform.CommonCrypto.CC_SHA256_DIGEST_LENGTH

internal actual fun digestSha1(input: ByteArray): ByteArray {
    val safeInput = if (input.isEmpty()) byteArrayOf(0) else input
    val output = UByteArray(CC_SHA1_DIGEST_LENGTH)
    safeInput.usePinned { source ->
        output.usePinned { target ->
            CC_SHA1(source.addressOf(0).reinterpret(), input.size.convert(), target.addressOf(0))
        }
    }
    return output.map { it.toByte() }.toByteArray()
}

internal actual fun digestSha256(input: ByteArray): ByteArray {
    val safeInput = if (input.isEmpty()) byteArrayOf(0) else input
    val output = UByteArray(CC_SHA256_DIGEST_LENGTH)
    safeInput.usePinned { source ->
        output.usePinned { target ->
            CC_SHA256(source.addressOf(0).reinterpret(), input.size.convert(), target.addressOf(0))
        }
    }
    return output.map { it.toByte() }.toByteArray()
}
