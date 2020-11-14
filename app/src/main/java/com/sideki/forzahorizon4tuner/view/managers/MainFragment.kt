package com.sideki.forzahorizon4tuner.view.managers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*
import ru.alex.forzahorizon4tuner.R

class MainFragment : Fragment(R.layout.fragment_main), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        btn_upgrades.setOnClickListener(this)
        btn_tune.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_upgrades -> navController.navigate(R.id.action_mainFragment_to_upgrade_Manager)
            R.id.btn_tune -> navController.navigate(R.id.action_mainFragment_to_tune_Manager)
        }
    }
}