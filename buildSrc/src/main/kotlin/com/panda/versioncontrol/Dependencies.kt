package com.panda.versioncontrol

import com.android.build.gradle.api.AndroidBasePlugin
import com.panda.versioncontrol.dependencies.AndroidX
import com.panda.versioncontrol.dependencies.Google
import com.panda.versioncontrol.dependencies.Kotlin
import com.panda.versioncontrol.dependencies.Testing.androidTestRules
import com.panda.versioncontrol.dependencies.Testing.androidTestRunner
import com.panda.versioncontrol.dependencies.Testing.espressoCore
import com.panda.versioncontrol.dependencies.Testing.jUnit
import org.gradle.api.Project

const val implementation = "implementation"
const val debugImplementation = "debugImplementation"
const val testImplementation = "testImplementation"
const val androidTestImplementation = "androidTestImplementation"

internal fun Project.configureDependencies() = dependencies.apply {
    add(implementation, (fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar")))))
    add(testImplementation, jUnit)

    if (project.containsAndroidPlugin()) {
        add(androidTestImplementation, androidTestRunner)
        add(androidTestImplementation, androidTestRules)
        add(androidTestImplementation, espressoCore)
    }

    add(implementation, AndroidX.appcompat)
    add(implementation, AndroidX.coreKtx)
    add(implementation, AndroidX.activityKtx)
    add(implementation, AndroidX.Fragment.fragmentKtx)
    add(debugImplementation, AndroidX.Fragment.fragmentTesting)
    add(implementation, AndroidX.constraintlayout)
    add(implementation, AndroidX.cardview)
    add(implementation, AndroidX.recyclerView)
    add(implementation, Kotlin.stdlibJdk7)
    add(implementation, Google.material)
    add(implementation, AndroidX.Lifecycle.commonJava8)
    add(implementation, AndroidX.Lifecycle.liveDataKtx)
    add(implementation, AndroidX.Lifecycle.viewModelKtx)

}

internal fun Project.containsAndroidPlugin(): Boolean {
    return project.plugins.toList().any { plugin -> plugin is AndroidBasePlugin }
}