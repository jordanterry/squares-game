package uk.co.jordanterry.squares

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import uk.co.jordanterry.components.ui.ComponentScreen

@AndroidEntryPoint
public class SquaresActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SquaresTheme {
                ComponentScreen()
            }
        }
    }
}
