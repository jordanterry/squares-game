package uk.co.jordanterry.squares.conventions

import com.autonomousapps.DependencyAnalysisSubExtension
import uk.co.jordanterry.squares.conventions.dsl.libs
import uk.co.jordanterry.squares.conventions.dsl.requireLibrary

plugins {
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

dependencies {
    "implementation"(libs.requireLibrary("javax-inject"))
    "implementation"(libs.requireLibrary("dagger"))
    "implementation"(libs.requireLibrary("dagger-hiltAndroid"))
    "implementation"(libs.requireLibrary("dagger-hiltCore"))
    "ksp"(libs.requireLibrary("dagger-hiltAndroidCompiler"))
}

extensions.configure<DependencyAnalysisSubExtension> {
    issues {
        onUsedTransitiveDependencies {
            exclude(libs.requireLibrary("javax-inject"))
        }
        onUnusedDependencies {
            exclude(libs.requireLibrary("javax-inject"))
            exclude(libs.requireLibrary("dagger"))
            exclude(libs.requireLibrary("dagger-hiltAndroid"))
            exclude(libs.requireLibrary("dagger-hiltCore"))
            exclude(libs.requireLibrary("dagger-hiltAndroidCompiler"))
        }
    }
}