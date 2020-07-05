package com.panda.versioncontrol

import com.panda.versioncontrol.dependencies.Version
import org.gradle.api.Plugin
import org.gradle.api.Project

class VersionPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            //读取gradle.properties中的配置，如果有则覆盖Version中配置的值
            findProperty("VERSION_NAME")?.also {
                Version.versionName = it as String
            }
            findProperty("VERSION_CODE")?.also {
                Version.versionCode = it as Int
            }

            configurePlugins()
            configureAndroid()
            configureDependencies()
        }
    }
}