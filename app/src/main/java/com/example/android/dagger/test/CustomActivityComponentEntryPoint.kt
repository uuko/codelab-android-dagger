package com.example.android.dagger.test

import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface CustomActivityComponentEntryPoint {
//    fun customActivityComponent(): CustomActivityComponent.Builder
}