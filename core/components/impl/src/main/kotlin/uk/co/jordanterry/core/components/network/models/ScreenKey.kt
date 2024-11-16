package uk.co.jordanterry.core.components.network.models

import kotlinx.serialization.Serializable

@Serializable
@JvmInline
value class ScreenKey(
    val name: String,
)