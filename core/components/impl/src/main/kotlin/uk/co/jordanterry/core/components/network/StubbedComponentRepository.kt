package uk.co.jordanterry.core.components.network

import uk.co.jordanterry.core.components.ComponentRepository
import uk.co.jordanterry.core.components.Screen
import javax.inject.Inject

class StubbedComponentRepository @Inject constructor() : ComponentRepository {
    override suspend fun get(screen: Screen): uk.co.jordanterry.core.components.Layout =
        when (screen) {
            Screen("home") -> uk.co.jordanterry.core.components.Layout.SingleColumnList(
                components = listOf(
                    uk.co.jordanterry.core.components.Component.Text.Small("Squares"),
                    uk.co.jordanterry.core.components.Component.Button.Small("Play"),
                    uk.co.jordanterry.core.components.Component.Button.Small("Settings"),
                    uk.co.jordanterry.core.components.Component.Button.Small("Go ad free!"),
                )
            )

            else -> uk.co.jordanterry.core.components.Layout.SingleColumnList(
                components = listOf(
                    uk.co.jordanterry.core.components.Component.Text.Large("Oh oh! Something has gone wrong."),
                )
            )
        }
}