package com.sideki.forzahorizon4tuner.view.managers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.upgrade_manager.*
import ru.alex.forzahorizon4tuner.R
import com.sideki.forzahorizon4tuner.view.hints.HintUpgrades

class UpgradeManager : Fragment(R.layout.upgrade_manager), View.OnClickListener {

    private var navController: NavController? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        btn_conversation_upgrades.setOnClickListener(this)
        btn_aero_upgrades.setOnClickListener(this)
        btn_tyres_upgrades.setOnClickListener(this)
        btn_drivetrain_upgrades.setOnClickListener(this)
        btn_platform_upgrades.setOnClickListener(this)
        btn_engine_upgrades.setOnClickListener(this)
        btn_back_upgrades.setOnClickListener(this)
        btn_hint_upgrades.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_back_upgrades -> navController?.navigateUp()
            R.id.btn_conversation_upgrades -> navController?.navigate(R.id.action_upgrade_Manager_to_a_Upgrade_Conversation)
            R.id.btn_aero_upgrades -> navController?.navigate(R.id.action_upgrade_Manager_to_b_Upgrade_AeroAndAppearance)
            R.id.btn_tyres_upgrades -> navController?.navigate(R.id.action_upgrade_Manager_to_c_Upgrade_TyresAndRims)
            R.id.btn_drivetrain_upgrades -> navController?.navigate(R.id.action_upgrade_Manager_to_d_Upgrade_Drivetrain)
            R.id.btn_platform_upgrades -> navController?.navigate(R.id.action_upgrade_Manager_to_e_Upgrade_PaltformAndHandling)
            R.id.btn_engine_upgrades -> navController?.navigate(R.id.action_upgrade_Manager_to_f_Upgrade_Engine)
            R.id.btn_hint_upgrades -> {
                val dialogFragment: DialogFragment = HintUpgrades()
                dialogFragment.setStyle(DialogFragment.STYLE_NO_FRAME, 0) // Убирает задник layout
                dialogFragment.show(childFragmentManager, dialogFragment.javaClass.name)
            }
        }
    }
}