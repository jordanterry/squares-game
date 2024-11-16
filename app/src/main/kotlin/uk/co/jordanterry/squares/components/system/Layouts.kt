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
    layout: uk.co.jordanterry.core.components.Layout.SingleColumnList,
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
fun Component(component: uk.co.jordanterry.core.components.Component) {
    when (component) {
        is uk.co.jordanterry.core.components.Component.Button.Large -> DsButton(
            button = component,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is uk.co.jordanterry.core.components.Component.Button.Medium -> DsButton(
            button = component,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is uk.co.jordanterry.core.components.Component.Button.Small -> DsButton(
            button = component,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is uk.co.jordanterry.core.components.Component.Text.Large -> DsText(text = component)
        is uk.co.jordanterry.core.components.Component.Text.Medium -> DsText(text = component)
        is uk.co.jordanterry.core.components.Component.Text.Small -> DsText(text = component)
    }
}
