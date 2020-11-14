package com.sideki.forzahorizon4tuner.view.managers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.sideki.forzahorizon4tuner.view.hints.HintTune
import kotlinx.android.synthetic.main.tune_manager.*
import ru.alex.forzahorizon4tuner.R

class TuneManager : Fragment(R.layout.tune_manager), View.OnClickListener {

    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        btn_tyres_tune.setOnClickListener(this)
        btn_gearing_tune.setOnClickListener(this)
        btn_alignment_tune.setOnClickListener(this)
        btn_antiroll_tune.setOnClickListener(this)
        btn_aero_tune.setOnClickListener(this)
        btn_brakes_tune.setOnClickListener(this)
        btn_diff_tune.setOnClickListener(this)
        btn_back_tune.setOnClickListener(this)
        btn_hint_tune.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_back_tune -> navController.navigateUp()
            R.id.btn_tyres_tune -> navController.navigate(R.id.action_tune_Manager_to_a_Tune_Tyres)
            R.id.btn_gearing_tune -> navController.navigate(R.id.action_tune_Manager_to_b_Tune_Gearing)
            R.id.btn_alignment_tune -> navController.navigate(R.id.action_tune_Manager_to_c_Tune_Alignment)
            R.id.btn_antiroll_tune -> navController.navigate(R.id.action_tune_Manager_to_d_Tune_AntiRoll)
            R.id.btn_aero_tune -> navController.navigate(R.id.action_tune_Manager_to_e_Tune_Aero)
            R.id.btn_brakes_tune -> navController.navigate(R.id.action_tune_Manager_to_f_Tune_Brakes)
            R.id.btn_diff_tune -> navController.navigate(R.id.action_tune_Manager_to_g_Tune_Differential)
            R.id.btn_hint_tune -> {
                val dialogFragment: DialogFragment = HintTune()
                dialogFragment.setStyle(DialogFragment.STYLE_NO_FRAME, 0) // Убирает задник layout
                dialogFragment.show(childFragmentManager, dialogFragment.javaClass.name)
            }
        }
    }

}