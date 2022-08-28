package com.wantech.savethenight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.wantech.savethenight.databinding.ActivityDashBactivityBinding

class DashBActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityDashBactivityBinding
    private lateinit var navController:NavController
    private lateinit var appBarConfiguration:AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashBactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

       navController=findNavController(R.id.av_host_fragment_activity_dash)
        appBarConfiguration= AppBarConfiguration(
            setOf(
               R.id.onBoardFragment,
                R.id.signUpFragment,
                R.id.loginFragment,
            )
        )
//        navController.navigateUp(appBarConfiguration)


    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) ||super.onSupportNavigateUp()
    }
}