package ru.alex.forzahorizon4tuner.upgrade

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.alex.forzahorizon4tuner.R

class C_UpgradeTyresAndRims : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v: View = inflater.inflate(R.layout.upgrade_tyres_and_ryims, container, false)
        v.findViewById<Button>(R.id.btn_menu_tyres_and_rims_upgrades).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View?) {
        requireActivity().onBackPressed()
    }
}
