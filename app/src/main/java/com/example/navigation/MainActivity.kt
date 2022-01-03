package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme
import com.example.navigator.Navigator
import com.example.navigator.NavigatorEvent
import com.example.navigator.routes.FirstDestination
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                SampleScaffold(navigator)
            }
        }
    }

    @Composable
    private fun SampleScaffold(navigator: Navigator) {
        val navController = rememberNavController()
        SetupNavController(navController)

        Scaffold {
            NavHost(
                navController = navController,
                startDestination = FirstDestination.route(),
                builder = {
                    registerComposableDestinations()
                }
            )
        }
    }

    @Composable
    private fun SetupNavController(navController: NavHostController) {
        LaunchedEffect(navController) {
            navigator.destinations.collect { navEvent ->
                when (navEvent) {
                    is NavigatorEvent.NavigateUp -> navController.navigateUp()
                    is NavigatorEvent.Destination -> navController.navigate(
                        navEvent.destination,
                        navEvent.builder
                    )
                }
            }
        }
    }
}
