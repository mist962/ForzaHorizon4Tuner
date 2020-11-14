package com.sideki.forzahorizon4tuner.view.hints

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import ru.alex.forzahorizon4tuner.R

class HintTyresTune : DialogFragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.hint_tune_tyres, container, false)
        v.findViewById<Button>(R.id.btn_hint_tyres_tune).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View?) {
        dismiss()
    }
}