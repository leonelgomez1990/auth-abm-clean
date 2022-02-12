package com.leo.abm.LoginFeature.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leo.abm.CoreFeature.utils.SingleLiveEvent
import com.leo.abm.LoginFeature.ui.navigatorstates.SplashNavigatorStates
import com.leo.abm.LoginFeature.ui.viewstates.SplashViewState

class SplashViewModel : ViewModel() {

    private val _navigation = SingleLiveEvent<SplashNavigatorStates>()
    val navigation: LiveData<SplashNavigatorStates> get() = _navigation

    private val _viewState: MutableLiveData<SplashViewState> = MutableLiveData()
    val viewState: LiveData<SplashViewState> get() = _viewState

    init {
        _viewState.value = SplashViewState.Loading
        _viewState.value = SplashViewState.Idle
    }

    fun goToSignIn() {
        _navigation.value = SplashNavigatorStates.ToSignIn
    }

}