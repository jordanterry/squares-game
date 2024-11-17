package uk.co.jordanterry.core.components

public sealed interface Layout {
    public data class SingleColumnList(
        val components: List<Component>,
    ) : Layout
}