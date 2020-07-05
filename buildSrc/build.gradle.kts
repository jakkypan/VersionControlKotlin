plugins {
    `kotlin-dsl`
//    id("org.gradle.kotlin.kotlin-dsl") version "1.2.9"
}

repositories {
    google()
    jcenter()
}

dependencies {
    implementation("com.android.tools.build:gradle:4.0.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
    implementation(gradleApi())
    implementation(localGroovy())
}