package uk.co.jordanterry.squares.conventions

import uk.co.jordanterry.squares.conventions.dsl.libs
import uk.co.jordanterry.squares.conventions.dsl.requireLibrary

plugins {
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

dependencies {
    "implementation"(libs.requireLibrary("hilt-android"))
    "ksp"(libs.requireLibrary("hilt-androidCompiler"))
}