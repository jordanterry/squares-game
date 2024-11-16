package uk.co.jordanterry.squares.components.network

import kotlinx.serialization.Serializable

@Serializable
@JvmInline
value class ScreenDefinition(
    val name: String,
)