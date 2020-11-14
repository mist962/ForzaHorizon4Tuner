package com.sideki.forzahorizon4tuner.view.tune

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import ru.alex.forzahorizon4tuner.R

class TuneGearing : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.tune_gearing, container, false)
        v.findViewById<Button>(R.id.btn_menu_gearing_tune).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View?) {
        requireActivity().onBackPressed()
    }
}