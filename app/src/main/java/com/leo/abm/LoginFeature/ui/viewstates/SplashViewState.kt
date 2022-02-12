package com.leo.abm.LoginFeature.ui.viewstates

import kotlin.Exception

sealed class SplashViewState {
    object Idle: SplashViewState()
    object Loading: SplashViewState()
    object Outdated: SplashViewState()
    data class Failure(val exception: Exception): SplashViewState()
}
