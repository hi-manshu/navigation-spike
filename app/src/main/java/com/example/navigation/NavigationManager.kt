package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.first_module.FirstComposable
import com.example.navigator.NavigationDestination
import com.example.navigator.routes.FirstDestination
import com.example.navigator.routes.SecondDestination
import com.example.second_module.SecondComposable


private val composableDestinations: Map<NavigationDestination, @Composable () -> Unit> = mapOf(
    FirstDestination to { FirstComposable() },
    SecondDestination to { SecondComposable() }
)


fun NavGraphBuilder.registerComposableDestinations() {
    composableDestinations.forEach { entry ->
        val destination = entry.key
        composable(destination.route(), destination.arguments, destination.deepLinks) {
            entry.value()
        }
    }
}
