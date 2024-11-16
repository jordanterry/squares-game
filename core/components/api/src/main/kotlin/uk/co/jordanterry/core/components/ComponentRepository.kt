package uk.co.jordanterry.core.components

interface ComponentRepository {
    suspend fun get(screen: Screen): Layout
}