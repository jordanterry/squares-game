package uk.co.jordanterry.squares.components.system

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uk.co.jordanterry.core.components.Component
import uk.co.jordanterry.core.components.Layout

@Composable
fun SingleColumnListScreen(
    layout: Layout.SingleColumnList,
    modifier: Modifier = Modifier,
) {
    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .width(250.dp)
                    .align(Alignment.Center),
            ) {
                layout.components.forEach { component ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Component(component)
                    }
                }
            }
        }
    }
}

@Composable
fun Component(component: Component) {
    when (component) {
        is Component.Button.Large -> DsButton(
            button = component,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is Component.Button.Medium -> DsButton(
            button = component,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is Component.Button.Small -> DsButton(
            button = component,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is Component.Text.Large -> DsText(text = component)
        is Component.Text.Medium -> DsText(text = component)
        is Component.Text.Small -> DsText(text = component)
    }
}
