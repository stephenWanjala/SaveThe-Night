package com.wantech.savethenight.ui.login

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.wantech.savethenight.MainActivity
import com.wantech.savethenight.R
import com.wantech.savethenight.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel
    private lateinit var loginBinding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginBinding= FragmentLoginBinding.inflate(layoutInflater)
        return loginBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[LoginViewModel::class.java]
        // TODO: Use the ViewModel
        val navController=findNavController()
        loginBinding.apply {
            forgotPassword.setOnClickListener {
                navController.navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
            }

//            login
            LoginButton.setOnClickListener {
                startActivity(
                    Intent(this@LoginFragment.context?.applicationContext,MainActivity::class.java)

                )


            }

        }
    }

}