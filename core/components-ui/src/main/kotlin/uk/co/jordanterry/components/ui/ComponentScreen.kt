package uk.co.jordanterry.components.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import uk.co.jordanterry.components.ui.system.SingleColumnListScreen
import uk.co.jordanterry.core.components.Layout

@Composable
public fun ComponentScreen(
    componentViewModel: ComponentViewModel,
) {
    val state by componentViewModel.state.collectAsState()
    when (val layout = state) {
        is Layout.SingleColumnList -> SingleColumnListScreen(
            layout
        )
    }
}