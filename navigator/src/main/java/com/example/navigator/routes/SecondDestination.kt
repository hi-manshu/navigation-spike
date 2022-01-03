package com.example.navigator.routes

import com.example.navigator.NavigationDestination

object SecondDestination : NavigationDestination {

    private const val SECOND_ROUTE = "Second"

    override fun route() = SECOND_ROUTE
}
