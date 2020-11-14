package ru.alex.forzahorizon4tuner.upgrade

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.alex.forzahorizon4tuner.R

class E_UpgradePaltformAndHandling : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v: View = inflater.inflate(R.layout.upgrade_paltform_and_handling, container, false)
        v.findViewById<Button>(R.id.btn_menu_platform_and_handling_upgrades).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View?) {
        requireActivity().onBackPressed()
    }
}