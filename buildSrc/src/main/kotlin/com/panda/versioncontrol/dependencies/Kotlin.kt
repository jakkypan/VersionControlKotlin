@file:Suppress("SpellCheckingInspection")

package com.panda.versioncontrol.dependencies

object Kotlin {
    private const val kotlinVersion = "1.3.61"
    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"

    private const val kotlinCoroutines = "1.3.1"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutines"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutines"
}