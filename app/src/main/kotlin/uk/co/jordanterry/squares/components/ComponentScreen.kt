package uk.co.jordanterry.squares.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import uk.co.jordanterry.core.components.Layout
import uk.co.jordanterry.squares.components.system.SingleColumnListScreen

@Composable
fun ComponentScreen(
    componentViewModel: ComponentViewModel,
) {
    val state by componentViewModel.state.collectAsState()
    when (val layout = state) {
        is Layout.SingleColumnList -> SingleColumnListScreen(
            layout
        )
    }
}