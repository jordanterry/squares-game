package uk.co.jordanterry.squares.conventions

import org.jetbrains.kotlin.gradle.dsl.KotlinAndroidProjectExtension
import uk.co.jordanterry.squares.conventions.dsl.android

internal val Project.packageName: String
    get() =
        project
            .path
            .replace(Regex("[^:a-z]"), "_")
            .replace(":", ".")


plugins {
    id("com.android.base")
}

android {
    namespace = "uk.co.jordanterry.squares${project.packageName}"
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion("21")
        targetCompatibility = JavaVersion.toVersion("21")
    }
}

extensions.configure<KotlinAndroidProjectExtension> {
    jvmToolchain(21)
    explicitApi()
    compilerOptions {
        allWarningsAsErrors.set(true)
    }
}