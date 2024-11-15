package uk.co.jordanterry.squares.conventions.dsl

import org.gradle.api.Project
import org.gradle.api.artifacts.MinimalExternalModuleDependency
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.provider.Provider
import org.gradle.kotlin.dsl.getByName

val Project.libs: VersionCatalog
    get() = this.extensions.getByName<VersionCatalogsExtension>("versionCatalogs").named("libs")

fun VersionCatalog.requiredVersion(alias: String): String =
    this.findVersion(alias).get().requiredVersion

fun VersionCatalog.requireLibrary(alias: String): Provider<MinimalExternalModuleDependency> =
    this.findLibrary(alias).get()