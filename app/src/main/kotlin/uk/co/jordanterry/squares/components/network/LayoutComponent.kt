package uk.co.jordanterry.squares.components.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface LayoutComponent {
    @Serializable
    data class SingleColumnList(
        @SerialName("components")
        val components: @Serializable(with = ServerSideListComponentSerializer::class) List<ServerSideComponent> = emptyList(),
    ) : LayoutComponent
}