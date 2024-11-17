package uk.co.jordanterry.core.components.network.models

import kotlinx.serialization.Serializable

@Serializable
@JvmInline
internal value class ScreenKey(
    internal val name: String,
)