package com.example.hiltuse.di

import com.example.hiltuse.hilt.Engine
import com.example.hiltuse.hilt.GasEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class EnginModule {

    @Binds
    abstract fun bindEngin(gasEngine: GasEngine): Engine
}