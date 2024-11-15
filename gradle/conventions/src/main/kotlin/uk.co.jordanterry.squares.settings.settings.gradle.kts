import com.android.build.api.dsl.SettingsExtension
import com.autonomousapps.DependencyAnalysisExtension

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention")
    id("com.autonomousapps.build-health")
    id("com.android.settings")
}

extensions.configure<DependencyAnalysisExtension> {
    structure {
        ignoreKtx(true)
    }
}
extensions.configure<SettingsExtension> {
    minSdk = 24
    compileSdk = 35
}