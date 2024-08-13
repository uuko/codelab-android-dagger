package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationViewModel
import com.example.android.dagger.user.UserManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object RegisterModule {

    @ActivityScoped
    @Provides
    fun provideViewModel(userManager: UserManager): RegistrationViewModel {
        return RegistrationViewModel(userManager)
    }
}