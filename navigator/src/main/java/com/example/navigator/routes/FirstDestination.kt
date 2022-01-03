package com.example.navigator.routes

import com.example.navigator.NavigationDestination

object FirstDestination : NavigationDestination {

    private const val FIRST_ROUTE = "First"

    override fun route() = FIRST_ROUTE
}
