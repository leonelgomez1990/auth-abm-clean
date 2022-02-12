package com.leo.abm.LoginFeature.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.leo.abm.LoginFeature.ui.navigatorstates.SplashNavigatorStates
import com.leo.abm.LoginFeature.ui.viewmodels.SplashViewModel
import com.leo.abm.LoginFeature.ui.viewstates.SplashViewState
import com.leo.abm.databinding.FragmentSplashBinding
import com.leo.abm.CoreFeature.utils.exhaustive

class SplashFragment : Fragment() {

    private val SPLASH_SCREEN_DELAY: Long = 1000

    companion object {
        fun newInstance() = SplashFragment()
    }

    private val viewModel: SplashViewModel by viewModels()
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setObservers()
    }

    private fun setObservers() {
        viewModel.navigation.observe(viewLifecycleOwner, Observer { handleNavigation(it) })
        viewModel.viewState.observe(viewLifecycleOwner, Observer { handleViewStates(it)})
    }

    private fun handleViewStates(state: SplashViewState) {
        when(state) {
            is SplashViewState.Failure -> {
                TODO()
            }
            is SplashViewState.Idle -> {
                viewModel.goToSignIn(SPLASH_SCREEN_DELAY)
            }
            is SplashViewState.Loading -> {
                TODO()
            }
            is SplashViewState.Outdated -> {
                TODO()
            }
        }.exhaustive
    }

    private fun handleNavigation(navigator: SplashNavigatorStates) {
        when(navigator) {
            SplashNavigatorStates.ToSignIn -> {
                val action = SplashFragmentDirections.actionSplashFragmentToSignInFragment()
                findNavController().navigate(action)
            }
        }

    }

}