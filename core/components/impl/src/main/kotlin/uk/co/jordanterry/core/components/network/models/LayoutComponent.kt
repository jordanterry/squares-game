package uk.co.jordanterry.core.components.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import uk.co.jordanterry.core.components.network.serializers.ServerSideListComponentSerializer

@Serializable
sealed interface LayoutComponent {
    @Serializable
    data class SingleColumnList(
        @SerialName("components")
        val components: @Serializable(with = ServerSideListComponentSerializer::class) List<ServerSideComponent> = emptyList(),
    ) : LayoutComponent
}