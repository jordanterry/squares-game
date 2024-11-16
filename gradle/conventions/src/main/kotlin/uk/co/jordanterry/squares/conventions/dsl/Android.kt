package uk.co.jordanterry.squares.conventions.dsl

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.getByName

internal typealias CommonAndroidExtension = CommonExtension<*, *, *, *, *, *>

internal val ExtensionAware.android: CommonAndroidExtension
    get() = extensions.getByName<CommonAndroidExtension>("android")


internal fun ExtensionAware.android(block: CommonAndroidExtension.() -> Unit) {
    android.block()
}
