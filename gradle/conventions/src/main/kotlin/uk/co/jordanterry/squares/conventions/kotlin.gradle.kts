package uk.co.jordanterry.squares.conventions

import org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension

extensions.configure<KotlinJvmProjectExtension> {
    jvmToolchain(17)
    explicitApi()
    compilerOptions {
        allWarningsAsErrors.set(true)
    }
}