package com.wantech.savethenight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.wantech.savethenight.databinding.ActivityDashBactivityBinding

class DashBActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityDashBactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashBactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController=findNavController(R.id.av_host_fragment_activity_dash)
        val appBarConfiguration= AppBarConfiguration(
            setOf(
               R.id.onBoardFragment,
                R.id.signUpFragment,
                R.id.loginFragment,
                R.id.forgotPasswordFragment
            )
        )
        navController.navigateUp(appBarConfiguration)


    }
}