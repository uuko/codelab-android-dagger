package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module
import dagger.Provides
//@Retention(AnnotationRetention.BINARY)
//@Qualifier
//annotation class RegistrationStorage
//
//@Retention(AnnotationRetention.BINARY)
//@Qualifier
//annotation class LoginStorage
@Module
abstract class StorageModule {
    //provide傳的是instance實例 , binds是interface
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

    //Implementations of an interface (although @Binds is recommended because it generates less code and therefore it's more efficient).
    //介面的實現（儘管 @Binds 建議這樣做，因為它生成的代碼較少，因此效率更高）。
    //Classes that your project doesn't own (e.g. instances of Retrofit).
    //您的項目不擁有的類（例如，實例 ）。
    // @Provides tell Dagger how to create instances of the type that this function
    // returns (i.e. Storage).
    // Function parameters are the dependencies of this type (i.e. Context).
//    @Provides
//    fun provideStorage(context: Context): Storage {
//        // Whenever Dagger needs to provide an instance of type Storage,
//        // this code (the one inside the @Provides method) will be run.
//        return SharedPreferencesStorage(context)
//    }

    //@RegistrationStorage
    //    @Provides
    //    fun provideRegistrationStorage(context: Context): Storage {
    //        return SharedPreferencesStorage("registration", context)
    //    }
    //
    //    @LoginStorage
    //    @Provides
    //    fun provideLoginStorage(context: Context): Storage {
    //        return SharedPreferencesStorage("login", context)
    //    }


    // In a method
//    class ClassDependingOnStorage(@RegistrationStorage private val storage: Storage) { ... }
//
//    // As an injected field
//    class ClassDependingOnStorage {
//
//        @Inject
//        @field:RegistrationStorage lateinit var storage: Storage
//    }

    //您可以使用 @Named 註釋實現與限定符相同的功能，但是建議使用限定符，因為：
    //
    //They can be stripped out from Proguard or R8
    //它們可以從 Proguard 或 R8 中剝離出來
    //You don't need to keep a shared constant for matching the names
    //您無需保留共用常量來匹配名稱
    //They can be documented 它們可以被記錄下來
}