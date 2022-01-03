package com.example.navigator.di

import com.example.navigator.NavigationDestinationImpl
import com.example.navigator.Navigator
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class NavigatorModule {

    @Binds
    abstract fun navigator(navigator: NavigationDestinationImpl): Navigator
}
