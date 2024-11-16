package uk.co.jordanterry.squares.conventions

import uk.co.jordanterry.squares.conventions.dsl.android

plugins {
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    buildFeatures {
        compose = true
    }
}
