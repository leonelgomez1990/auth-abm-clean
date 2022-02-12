package com.leo.abm.LoginFeature.di

import com.leo.abm.LoginFeature.ui.viewmodels.SignInViewModel
import com.leo.abm.LoginFeature.ui.viewmodels.SplashViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    fun provideSplashViewModel () : SplashViewModel = SplashViewModel()

    @Provides
    fun provideSignInViewModel () : SignInViewModel = SignInViewModel()
}
