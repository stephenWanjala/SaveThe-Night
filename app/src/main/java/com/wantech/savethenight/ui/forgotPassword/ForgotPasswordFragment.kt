

package com.wantech.savethenight.ui.forgotPassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.wantech.savethenight.R
import com.wantech.savethenight.databinding.FragmentForgotPasswordBinding

class ForgotPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = ForgotPasswordFragment()
    }

    private lateinit var viewModel: ForgotPasswordViewModel
    private lateinit var binding: FragmentForgotPasswordBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForgotPasswordBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[ForgotPasswordViewModel::class.java]
        // TODO: Use the ViewModel

        binding.apply {

            close.setOnClickListener {
                findNavController().navigate(R.id.action_forgotPasswordFragment_to_loginFragment)
            }
        }

    }

}