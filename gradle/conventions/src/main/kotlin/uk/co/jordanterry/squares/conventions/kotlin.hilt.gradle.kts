package uk.co.jordanterry.squares.conventions

import com.autonomousapps.DependencyAnalysisSubExtension
import uk.co.jordanterry.squares.conventions.dsl.libs
import uk.co.jordanterry.squares.conventions.dsl.requireLibrary

plugins {
    id("com.google.devtools.ksp")
}

dependencies {
    "implementation"(libs.requireLibrary("javax-inject"))
    "implementation"(libs.requireLibrary("dagger"))
    "implementation"(libs.requireLibrary("dagger-hiltCore"))
    "ksp"(libs.requireLibrary("dagger-hiltCompiler"))
}

extensions.configure<DependencyAnalysisSubExtension> {
    issues {
        onAny {
            exclude(libs.requireLibrary("javax-inject"))
            exclude(libs.requireLibrary("dagger"))
            exclude(libs.requireLibrary("dagger-hiltCore"))
            exclude(libs.requireLibrary("dagger-hiltCompiler"))
        }
    }
}