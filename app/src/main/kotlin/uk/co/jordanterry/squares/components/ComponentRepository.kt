package uk.co.jordanterry.squares.components

import uk.co.jordanterry.squares.Screen
import uk.co.jordanterry.squares.components.models.Layout

interface ComponentRepository {
    suspend fun get(screen: Screen): Layout
}