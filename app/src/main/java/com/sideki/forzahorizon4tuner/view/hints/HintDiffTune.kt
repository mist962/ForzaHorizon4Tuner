package com.sideki.forzahorizon4tuner.view.hints

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import ru.alex.forzahorizon4tuner.R

class HintDiffTune : DialogFragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.hint_tune_diff, container, false)
        v.findViewById<View>(R.id.btn_hint_diff_tune).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View) {
        dismiss()
    }
}