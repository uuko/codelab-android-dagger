package com.example.android.dagger.di

import dagger.Module

// This module tells AppComponent which are its subcomponents
@Module(subcomponents = [RegistrationComponent::class, LoginComponent::class, UserComponent::class])
class AppSubcomponents