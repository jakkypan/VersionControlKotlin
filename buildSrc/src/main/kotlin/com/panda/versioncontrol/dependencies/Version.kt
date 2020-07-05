package com.panda.versioncontrol.dependencies

object Version {

    const val compileSdkVersion = 29
    const val minSdkVersion = 23
    const val targetSdkVersion = 25

    //在gradle.properties中配置会覆盖该值
    var versionName = "1.0"
    var versionCode = 1
}