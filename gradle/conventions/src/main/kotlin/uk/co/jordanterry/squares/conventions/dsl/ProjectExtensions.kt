package uk.co.jordanterry.squares.conventions.dsl

import org.gradle.api.Project

internal val Project.packageName: String
    get() =
        project
            .path
            .replace(Regex("[^:a-z]"), "_")
            .replace(":", ".")