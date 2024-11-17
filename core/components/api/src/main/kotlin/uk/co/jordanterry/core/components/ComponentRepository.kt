package uk.co.jordanterry.core.components

public interface ComponentRepository {
    public suspend fun get(screen: Screen): Layout
}