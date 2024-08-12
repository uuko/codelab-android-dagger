package com.example.android.dagger.di

import javax.inject.Scope

//Scoping rules: 範圍界定規則：
//
//When a type is marked with a scope annotation,
// it can only be used by Components that are annotated with the same scope.
//當類型使用範圍批註標記時，它只能由具有相同範圍批註的元件使用。
//When a Component is marked with a scope annotation,
// it can only provide types with that annotation or types that have no annotation.
//當元件使用範圍註釋標記時，它只能提供具有該註釋的類型或沒有註釋的類型。
//A subcomponent cannot use a scope annotation used by one of its parent Components.
//子元件不能使用其父元件之一使用的範圍註釋。
//Components also involve subcomponents in this context.
//在此上下文中，元件還涉及子元件。
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class ActivityScope