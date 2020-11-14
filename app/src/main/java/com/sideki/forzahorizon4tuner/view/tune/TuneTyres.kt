package com.sideki.forzahorizon4tuner.view.tune

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.sideki.forzahorizon4tuner.view.hints.HintTyresTune
import ru.alex.forzahorizon4tuner.R

class TuneTyres : Fragment(), View.OnClickListener {

    private var spinVibor: Spinner? = null
    private var textResult: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.tune_tyres, container, false)
        spinVibor = v.findViewById(R.id.spin_vibor_v_davlenie)
        textResult = v.findViewById(R.id.txt_rezult_v_nastr)
        v.findViewById<Button>(R.id.btn_menu_tyres_tune).setOnClickListener(this)
        v.findViewById<Button>(R.id.btn_rezult_tyres).setOnClickListener(this)
        v.findViewById<Button>(R.id.btn_hint_tyres_tune).setOnClickListener(this)
        return v
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_menu_tyres_tune -> requireActivity().onBackPressed()
            R.id.btn_rezult_tyres -> {
                when (spinVibor?.selectedItemPosition) {
                    0 -> textResult?.text = resources.getString(R.string.tune_tyres_0)
                    1 -> textResult?.text = resources.getString(R.string.tune_tyres_1)
                    2 -> textResult?.text = resources.getString(R.string.tune_tyres_2)
                    3 -> textResult?.text = resources.getString(R.string.tune_tyres_3)
                    4 -> textResult?.text = resources.getString(R.string.tune_tyres_4)
                    5 -> textResult?.text = resources.getString(R.string.tune_tyres_5)
                    6 -> textResult?.text = resources.getString(R.string.tune_tyres_6)
                }
            }
            R.id.btn_hint_tyres_tune -> {
                val dialogFragment: DialogFragment = HintTyresTune()
                dialogFragment.setStyle(DialogFragment.STYLE_NO_FRAME, 0)
                dialogFragment.show(childFragmentManager, javaClass.name)
            }
        }
    }
}