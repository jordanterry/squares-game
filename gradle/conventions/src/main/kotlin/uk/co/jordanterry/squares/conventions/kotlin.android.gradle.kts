package uk.co.jordanterry.squares.conventions

import org.jetbrains.kotlin.gradle.dsl.ExplicitApiMode
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.serialization")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        explicitApiMode.set(ExplicitApiMode.Strict)
        jvmTarget.set(JvmTarget.fromTarget("17"))
        allWarningsAsErrors.set(true)
    }
}