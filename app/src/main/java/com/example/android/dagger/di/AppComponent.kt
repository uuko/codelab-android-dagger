package com.example.android.dagger.di;

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity;
import com.example.android.dagger.registration.enterdetails.EnterDetailsFragment
import com.example.android.dagger.registration.termsandconditions.TermsAndConditionsFragment
import com.example.android.dagger.settings.SettingsActivity
import com.example.android.dagger.user.UserManager
import dagger.BindsInstance

import dagger.Component;
import javax.inject.Singleton
//UserComponent 可以注入多個 Activity，並且 Activity 的數量可能會增加
@Singleton
@Component(modules = [StorageModule::class, AppSubcomponents::class])
interface AppComponent {
    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    // Classes that can be injected by this Component
//    fun inject(activity: MainActivity)
//    fun inject(activity: SettingsActivity)

    //因為兩個fragmemnt要共用viewmodel 又不能讓他singelton（這樣資料會一直在memory) 所以需要改成subcompooemt
//    fun inject(activity:RegistrationActivity)
//    fun inject(fragment: EnterDetailsFragment)
//    fun inject(fragment: TermsAndConditionsFragment)
    // 2) Expose UserManager so that MainActivity and SettingsActivity
    // can access a particular instance of UserComponent
    fun userManager(): UserManager
    // Expose RegistrationComponent factory from the graph
    fun registrationComponent(): RegistrationComponent.Factory

    fun loginComponent(): LoginComponent.Factory

    fun userComponent(): UserComponent.Factory
}
