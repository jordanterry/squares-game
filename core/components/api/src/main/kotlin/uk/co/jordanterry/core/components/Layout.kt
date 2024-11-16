package uk.co.jordanterry.core.components

sealed interface Layout {
    data class SingleColumnList(
        val components: List<Component>,
    ) : Layout
}