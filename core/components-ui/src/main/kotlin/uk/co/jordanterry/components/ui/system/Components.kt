package uk.co.jordanterry.components.ui.system

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import uk.co.jordanterry.core.components.Action
import uk.co.jordanterry.core.components.Component

@Composable
internal fun ComponentText(
    text: Component.Text.Small,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text.text,
        modifier = modifier,
    )
}

@Composable
internal fun ComponentText(
    text: Component.Text.Medium,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text.text,
        modifier = modifier,
    )
}

@Composable
internal fun ComponentText(
    text: Component.Text.Large,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text.text,
        modifier = modifier,
    )
}

@Composable
internal fun ComponentButton(
    button: Component.Button.Small,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {
            when (val action = button.action) {
                is Action.NavigateTo -> {
                    navController.navigate(action.screen)
                }
            }
        },
        modifier = modifier,
    ) { Text(button.text) }
}

@Composable
internal fun ComponentButton(
    button: Component.Button.Medium,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {
            when (val action = button.action) {
                is Action.NavigateTo -> {
                    navController.navigate(action.screen)
                }
            }
        },
        modifier = modifier,
    ) { Text(button.text) }
}

@Composable
internal fun ComponentButton(
    button: Component.Button.Large,
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {
            when (val action = button.action) {
                is Action.NavigateTo -> {
                    navController.navigate(action.screen)
                }
            }
        },
        modifier = modifier,
    ) { Text(button.text) }
}
