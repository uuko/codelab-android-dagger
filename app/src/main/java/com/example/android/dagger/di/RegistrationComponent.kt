package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import dagger.Subcomponent

//子元件是繼承和擴展父元件的物件圖的元件。因此，在父元件中提供的所有物件也將在子元件中提供。
// 這樣，子元件中的物件可以依賴於父元件提供的物件。
//scope compoent只能有沒scope 或同ActivityScope 的 module
@ActivityScope
@Subcomponent
interface RegistrationComponent {
    // Factory to create instances of RegistrationComponent
    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    // Classes that can be injected by this Component
    fun inject(activity: RegistrationActivity)
    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
}