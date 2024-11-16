package uk.co.jordanterry.squares

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import dagger.hilt.android.AndroidEntryPoint
import uk.co.jordanterry.squares.components.ComponentScreen
import uk.co.jordanterry.squares.components.ComponentViewModel
import uk.co.jordanterry.squares.ui.theme.SquaresTheme

@AndroidEntryPoint
class SquaresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SquaresTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Screen("home")) {
                    composable<Screen> { backStackEntry ->
                        val componentViewModel: ComponentViewModel = hiltViewModel()
                        ComponentScreen(backStackEntry.toRoute<Screen>(), componentViewModel)
                    }
                }
            }
        }
    }
}
