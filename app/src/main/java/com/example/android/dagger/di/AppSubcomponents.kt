package com.example.android.dagger.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)

// This module tells AppComponent which are its subcomponents
@Module(subcomponents = [UserComponent::class])
class AppSubcomponents