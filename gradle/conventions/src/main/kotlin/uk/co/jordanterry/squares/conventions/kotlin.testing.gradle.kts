package uk.co.jordanterry.squares.conventions

import com.autonomousapps.DependencyAnalysisSubExtension
import uk.co.jordanterry.squares.conventions.dsl.libs
import uk.co.jordanterry.squares.conventions.dsl.requireLibrary

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    "testImplementation"(libs.requireLibrary("test-kotestRunner"))
    "testImplementation"(libs.requireLibrary("test-kotestAssertions"))
    "testImplementation"(libs.requireLibrary("test-koTestAssertionsApi"))
    "testImplementation"(libs.requireLibrary("test-koTestAssertionsShared"))
    "testImplementation"(libs.requireLibrary("test-koTestFrameworkApi"))
}

extensions.configure<DependencyAnalysisSubExtension> {
    issues {
        onUnusedDependencies {
            exclude(libs.requireLibrary("test-kotestRunner"))
            exclude(libs.requireLibrary("test-kotestAssertions"))
            exclude(libs.requireLibrary("test-koTestAssertionsApi"))
            exclude(libs.requireLibrary("test-koTestAssertionsShared"))
            exclude(libs.requireLibrary("test-koTestFrameworkApi"))
        }
    }
}