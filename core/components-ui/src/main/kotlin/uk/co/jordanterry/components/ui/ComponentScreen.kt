package uk.co.jordanterry.components.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import uk.co.jordanterry.components.ui.system.SingleColumnListScreen
import uk.co.jordanterry.core.components.Layout
import uk.co.jordanterry.core.components.Screen

@Composable
private fun ComponentScreen(
    componentViewModel: ComponentViewModel,
) {
    val state by componentViewModel.state.collectAsState()
    when (val layout = state) {
        is Layout.SingleColumnList -> SingleColumnListScreen(
            layout
        )
    }
}

@Composable
public fun ComponentScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen("home")) {
        composable<Screen> { _ ->
            val componentViewModel: ComponentViewModel =
                hiltViewModel()
            ComponentScreen(componentViewModel)
        }
    }
}