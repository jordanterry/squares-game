package uk.co.jordanterry.core.components.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import uk.co.jordanterry.core.components.network.serializers.LayoutComponentSerializer

@Serializable
internal data class ComponentResults(
    @SerialName("screens")
    val screens: Map<ScreenKey, @Serializable(with = LayoutComponentSerializer::class) LayoutComponent>,
)
