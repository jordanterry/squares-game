package uk.co.jordanterry.squares.components

import uk.co.jordanterry.squares.Screen
import uk.co.jordanterry.squares.components.models.Component
import uk.co.jordanterry.squares.components.models.Layout
import javax.inject.Inject

class StubbedComponentRepository @Inject constructor() : ComponentRepository {
    override suspend fun get(screen: Screen): Layout =
        when (screen) {
            Screen("home") -> Layout.SingleColumnList(
                components = listOf(
                    Component.Text.Small("Squares"),
                    Component.Button.Small("Play"),
                    Component.Button.Small("Settings"),
                    Component.Button.Small("Go ad free!"),
                )
            )

            else -> Layout.SingleColumnList(
                components = listOf(
                    Component.Text.Large("Oh oh! Something has gone wrong."),
                )
            )
        }
}