package uk.co.jordanterry.components.ui.system

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
import androidx.navigation.NavController
import uk.co.jordanterry.core.components.Component
import uk.co.jordanterry.core.components.Layout

@Composable
internal fun SingleColumnListScreen(
    layout: Layout.SingleColumnList,
    navController: NavController,
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
                        Component(component, navController)
                    }
                }
            }
        }
    }
}

@Composable
internal fun Component(
    component: Component,
    navController: NavController,
) {
    when (component) {
        is Component.Button.Large -> ComponentButton(
            button = component,
            navController = navController,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is Component.Button.Medium -> ComponentButton(
            button = component,
            navController = navController,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is Component.Button.Small -> ComponentButton(
            button = component,
            navController = navController,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        )

        is Component.Text.Large -> ComponentText(text = component)
        is Component.Text.Medium -> ComponentText(text = component)
        is Component.Text.Small -> ComponentText(text = component)
    }
}
