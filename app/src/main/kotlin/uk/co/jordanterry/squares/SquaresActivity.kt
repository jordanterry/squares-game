package uk.co.jordanterry.squares

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import uk.co.jordanterry.components.ui.ComponentScreen
import uk.co.jordanterry.components.ui.ComponentViewModel
import uk.co.jordanterry.core.components.Screen

@AndroidEntryPoint
public class SquaresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SquaresTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Screen("home")) {
                    composable<Screen> { _ ->
                        val componentViewModel: ComponentViewModel =
                            hiltViewModel()
                        ComponentScreen(componentViewModel)
                    }
                }
            }
        }
    }
}
