package com.leo.abm.LoginFeature.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.leo.abm.CoreFeature.utils.SingleLiveEvent
import com.leo.abm.LoginFeature.ui.navigatorstates.SplashNavigatorStates
import com.leo.abm.LoginFeature.ui.viewstates.SplashViewState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    private val _navigation = SingleLiveEvent<SplashNavigatorStates>()
    val navigation: LiveData<SplashNavigatorStates> get() = _navigation

    private val _viewState: MutableLiveData<SplashViewState> = MutableLiveData()
    val viewState: LiveData<SplashViewState> get() = _viewState

    init {
        _viewState.value = SplashViewState.Loading
        _viewState.value = SplashViewState.Idle
    }

    fun goToSignIn( delayMs: Long) {
        viewModelScope.launch {
            delay(delayMs)
            _navigation.value = SplashNavigatorStates.ToSignIn
        }
    }

}