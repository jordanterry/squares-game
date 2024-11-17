package uk.co.jordanterry.core.components

public sealed interface Action {
    public data class NavigateTo(val screen: Screen) : Action
}