package com.example.android.dagger.di

import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.settings.SettingsActivity
import dagger.Subcomponent

// Definition of a Dagger subcomponent
@LoggedUserScope
@Subcomponent
interface UserComponent {

    // Factory to create instances of UserComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): UserComponent
    }

    //為了讓UserDataRepository 在兩個activity同個memory
    // Classes that can be injected by this Component
    fun inject(activity: MainActivity)
    fun inject(activity: SettingsActivity)
}