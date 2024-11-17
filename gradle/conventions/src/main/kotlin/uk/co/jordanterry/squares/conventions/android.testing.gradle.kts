package uk.co.jordanterry.squares.conventions

import com.autonomousapps.DependencyAnalysisSubExtension
import uk.co.jordanterry.squares.conventions.dsl.libs
import uk.co.jordanterry.squares.conventions.dsl.requireLibrary

dependencies {
    "androidTestImplementation"(libs.requireLibrary("test-junit"))
    "androidTestImplementation"(libs.requireLibrary("test-androidx-testMonitor"))
    "androidTestImplementation"(platform(libs.requireLibrary("compose-bom")))
    "androidTestImplementation"(libs.requireLibrary("test-androidx-espressoCore"))
    "androidTestImplementation"(libs.requireLibrary("test-androidx-junit"))
    "androidTestImplementation"(libs.requireLibrary("test-androidx-ui-testJunit4"))
}

extensions.configure<DependencyAnalysisSubExtension> {
    issues {
        onUnusedDependencies {
            exclude(libs.requireLibrary("test-junit"))
            exclude(libs.requireLibrary("test-androidx-testMonitor"))
            exclude(libs.requireLibrary("test-androidx-espressoCore"))
            exclude(libs.requireLibrary("test-androidx-junit"))
            exclude(libs.requireLibrary("test-androidx-ui-testJunit4"))
        }
    }
}