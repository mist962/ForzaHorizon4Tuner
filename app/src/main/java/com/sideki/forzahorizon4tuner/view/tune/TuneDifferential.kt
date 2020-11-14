package com.sideki.forzahorizon4tuner.view.tune

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import ru.alex.forzahorizon4tuner.R
import com.sideki.forzahorizon4tuner.view.hints.HintDiffTune

class TuneDifferential : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.tune_differential, container, false)
        v.findViewById<Button>(R.id.btn_menu_diff_tune).setOnClickListener(this)
        v.findViewById<Button>(R.id.btn_hint_diff_tune).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_menu_diff_tune -> requireActivity().onBackPressed()
            R.id.btn_hint_diff_tune -> {
                val dialogFragment: DialogFragment = HintDiffTune()
                dialogFragment.setStyle(DialogFragment.STYLE_NO_FRAME, 0)
                dialogFragment.show(childFragmentManager, javaClass.name)
            }
        }
    }
}