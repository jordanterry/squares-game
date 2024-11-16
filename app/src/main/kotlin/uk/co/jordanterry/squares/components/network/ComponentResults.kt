package uk.co.jordanterry.squares.components.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ComponentResults(
    @SerialName("screens")
    val screens: Map<ScreenDefinition, @Serializable(with = LayoutComponentSerializer::class) LayoutComponent>,
)
