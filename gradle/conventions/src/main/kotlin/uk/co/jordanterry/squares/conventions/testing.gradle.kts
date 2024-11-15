package uk.co.jordanterry.squares.conventions

import uk.co.jordanterry.squares.conventions.dsl.libs
import uk.co.jordanterry.squares.conventions.dsl.requireLibrary

tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    "testImplementation"(libs.requireLibrary("test-kotestRunner"))
    "testImplementation"(libs.requireLibrary("test-kotestAssertions"))
}