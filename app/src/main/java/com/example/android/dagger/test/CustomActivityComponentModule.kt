package com.example.android.dagger.test

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CustomActivityComponentModule {

//    @Singleton
//    @Provides
//    fun provideCustomActivityComponent(
//        singletonComponent: SingletonComponent
//    ): CustomActivityComponent {
//        return singletonComponent.customActivityComponent()
//    }
}