package com.wantech.savethenight.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.wantech.savethenight.MainActivity
import com.wantech.savethenight.R
import com.wantech.savethenight.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {


    private lateinit var viewModel: LoginViewModel
    private lateinit var loginBinding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        loginBinding = FragmentLoginBinding.inflate(layoutInflater)
        return loginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = findNavController()
        loginBinding.apply {
            forgotPassword.setOnClickListener {
                navController.navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
            }

//            login
            LoginButton.setOnClickListener {
                startActivity(
                    Intent(this@LoginFragment.context?.applicationContext, MainActivity::class.java)
                )
                requireActivity().finish()


            }

        }
    }

}