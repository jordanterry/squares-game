plugins {
    `kotlin-dsl`
    id("java-gradle-plugin")
}

dependencies {
    implementation(libs.plugins.foojay.resolver.convention.asDependency())
    implementation(libs.plugins.android.application.asDependency())
    implementation(libs.plugins.android.testing.asDependency())
    implementation(libs.plugins.android.settings.asDependency())
    implementation(libs.plugins.build.health.asDependency())
    implementation(libs.plugins.kotlin.android.asDependency())
    implementation(libs.plugins.kotlin.compose.asDependency())
    implementation(libs.plugins.kotlin.serialization.asDependency())
    implementation(libs.plugins.kotlin.ksp.asDependency())
    implementation(libs.plugins.build.health.asDependency())
    implementation(libs.plugins.dagger.hilt.asDependency())
    implementation(libs.plugins.square.dependencySorter.asDependency())
}

fun Provider<PluginDependency>.asDependency(): Provider<String> =
    this.map { "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}" }