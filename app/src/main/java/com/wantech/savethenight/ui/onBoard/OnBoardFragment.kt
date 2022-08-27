package com.wantech.savethenight.ui.onBoard

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.wantech.savethenight.R
import com.wantech.savethenight.databinding.FragmentOnBoardBinding

class OnBoardFragment : Fragment() {

    companion object {
        fun newInstance() = OnBoardFragment()
    }

    private lateinit var viewModel: OnBoardViewModel
private  lateinit var binding: FragmentOnBoardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentOnBoardBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[OnBoardViewModel::class.java]
        // TODO: Use the ViewModel
        val navController=findNavController()
        binding.apply {
            boardSignUpButton.setOnClickListener {
                navController.navigate(R.id.action_onBoardFragment_to_signUpFragment)
            }
            boardLoginButton.setOnClickListener {
                navController.navigate(R.id.action_onBoardFragment_to_loginFragment)

            }
        }


    }

}