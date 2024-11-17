package uk.co.jordanterry.core.components.network.models

import kotlinx.serialization.Serializable

@Serializable
internal sealed interface ActionComponent {
    @Serializable
    data class NavigateTo(val navigateTo: ScreenKey) : ActionComponent
}