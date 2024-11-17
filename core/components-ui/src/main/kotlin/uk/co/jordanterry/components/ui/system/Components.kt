package uk.co.jordanterry.components.ui.system

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {},
        modifier = modifier,
    ) { Text(button.text) }
}

@Composable
internal fun ComponentButton(
    button: Component.Button.Medium,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {
            button.action
        },
        modifier = modifier,
    ) { Text(button.text) }
}

@Composable
internal fun ComponentButton(
    button: Component.Button.Large,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {},
        modifier = modifier,
    ) { Text(button.text) }
}
