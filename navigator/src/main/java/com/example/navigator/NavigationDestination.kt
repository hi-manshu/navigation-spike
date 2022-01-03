package com.example.navigator

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

fun interface NavigationDestination {

    fun route(): String

    val arguments: List<NamedNavArgument>
        get() = emptyList()

    val deepLinks: List<NavDeepLink>
        get() = emptyList()
}
