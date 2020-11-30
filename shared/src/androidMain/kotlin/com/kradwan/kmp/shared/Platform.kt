package com.kradwan.kmp.shared

actual class Platform actual constructor() {
    actual val platform: String = "And2roid ${android.os.Build.VERSION.SDK_INT}"
}