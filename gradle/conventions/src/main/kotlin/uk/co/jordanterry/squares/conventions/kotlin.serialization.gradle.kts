package uk.co.jordanterry.squares.conventions

import com.autonomousapps.DependencyAnalysisSubExtension
import uk.co.jordanterry.squares.conventions.dsl.libs
import uk.co.jordanterry.squares.conventions.dsl.requireLibrary

plugins {
    id("org.jetbrains.kotlin.plugin.serialization")
}

dependencies {
    "implementation"(libs.requireLibrary("kotlinx-serializationCore"))
}

extensions.configure<DependencyAnalysisSubExtension> {
    issues {
        onAny {
            exclude(libs.requireLibrary("kotlinx-serializationCore"))
        }
    }
}