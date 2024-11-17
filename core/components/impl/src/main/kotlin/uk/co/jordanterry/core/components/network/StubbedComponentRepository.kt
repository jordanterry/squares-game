package uk.co.jordanterry.core.components.network

import uk.co.jordanterry.core.components.Action
import uk.co.jordanterry.core.components.Component
import uk.co.jordanterry.core.components.ComponentRepository
import uk.co.jordanterry.core.components.Layout
import uk.co.jordanterry.core.components.Screen
import javax.inject.Inject

public class StubbedComponentRepository @Inject constructor() : ComponentRepository {
    override suspend fun get(screen: Screen): Layout =
        when (screen) {
            Screen("home") -> Layout.SingleColumnList(
                components = listOf(
                    Component.Text.Small("Squares"),
                    Component.Button.Small("Play", Action.NavigateTo(Screen("game"))),
                    Component.Button.Small("Settings", Action.NavigateTo(Screen("settings"))),
                    Component.Button.Small("Go ad free!", Action.NavigateTo(Screen("go_ad_free"))),
                )
            )

            Screen("settings") -> Layout.SingleColumnList(
                components = listOf(
                    Component.Text.Small("Settings"),
                    Component.Button.Small("Go ad free!", Action.NavigateTo(Screen("go_ad_free"))),
                )
            )

            Screen("go_ad_free") -> Layout.SingleColumnList(
                components = listOf(
                    Component.Text.Small("Go ad free!"),
                )
            )

            else -> Layout.SingleColumnList(
                components = listOf(
                    Component.Text.Large("Oh oh! Something has gone wrong."),
                )
            )
        }
}