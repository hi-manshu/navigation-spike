package com.example.navigator

import androidx.navigation.NavOptionsBuilder

sealed class NavigatorEvent {

    object NavigateUp : NavigatorEvent()

    class Destination(
        val destination: String,
        val builder: NavOptionsBuilder.() -> Unit
    ) : NavigatorEvent()
}
