package com.leo.abm.LoginFeature.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leo.abm.LoginFeature.ui.viewstates.LoginViewState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
): ViewModel() {
//class SignInViewModel (): ViewModel() {

        private val _viewState: MutableLiveData<LoginViewState> = MutableLiveData()
    val viewState: LiveData<LoginViewState> get() = _viewState

    init {
        _viewState.value = LoginViewState.Loading
    }
}