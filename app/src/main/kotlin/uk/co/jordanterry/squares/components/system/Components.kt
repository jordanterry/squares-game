package uk.co.jordanterry.squares.components.system

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import uk.co.jordanterry.core.components.Component

@Composable
fun DsText(
    text: Component.Text.Small,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text.text,
        modifier = modifier,
    )
}

@Composable
fun DsText(
    text: Component.Text.Medium,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text.text,
        modifier = modifier,
    )
}

@Composable
fun DsText(
    text: Component.Text.Large,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text.text,
        modifier = modifier,
    )
}

@Composable
fun DsButton(
    button: Component.Button.Small,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {},
        modifier = modifier,
    ) { Text(button.text) }
}

@Composable
fun DsButton(
    button: Component.Button.Medium,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {},
        modifier = modifier,
    ) { Text(button.text) }
}

@Composable
fun DsButton(
    button: Component.Button.Large,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = {},
        modifier = modifier,
    ) { Text(button.text) }
}
