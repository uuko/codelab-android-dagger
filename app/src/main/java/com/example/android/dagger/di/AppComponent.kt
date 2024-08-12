package com.example.android.dagger.di;

import dagger.Component;

@Component
public interface AppComponent {
    fun inject(activity: RegistrationActivity)
}
