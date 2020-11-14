package com.sideki.forzahorizon4tuner.view.tune

import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import ru.alex.forzahorizon4tuner.R

class TuneAntiRoll : Fragment(), View.OnClickListener, TextWatcher {

    private var frontNagruz: EditText? = null
    private var antiRollBarsFrontMin: EditText? = null
    private var antiRollBarsFrontMax: EditText? = null
    private var antiRollBarsRearMin: EditText? = null
    private var antiRollBarsRearMax: EditText? = null
    private var springsFrontMin: EditText? = null
    private var springsFrontMax: EditText? = null
    private var springsRearMin: EditText? = null
    private var springsRearMax: EditText? = null
    private var dampingFrontMin: EditText? = null
    private var dampingFrontMax: EditText? = null
    private var dampingRearMin: EditText? = null
    private var dampingRearMax: EditText? = null
    private var reboundStiffnessFront: EditText? = null
    private var reboundStiffnessRear: EditText? = null

    private var antiRollBarsFrontResult: TextView? = null
    private var antiRollBarsRearResult: TextView? = null
    private var springsFrontResult: TextView? = null
    private var springsRearResult: TextView? = null
    private var dampingFrontResult: TextView? = null
    private var dampingRearResult: TextView? = null
    private var reboundStiffnessFrontResult: TextView? = null
    private var reboundStiffnessRearResult: TextView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.tune_antiroll, container, false)
        v.findViewById<Button>(R.id.btn_menu_antiroll_tune).setOnClickListener(this)

        frontNagruz = v.findViewById(R.id.nastr_poper_frontNagruz)
        frontNagruz?.addTextChangedListener(this)

        antiRollBarsFrontMin = v.findViewById(R.id.nastr_poper_min1)
        antiRollBarsFrontMax = v.findViewById(R.id.nastr_poper_max1)
        antiRollBarsFrontResult = v.findViewById(R.id.nastr_poper_result1)

        antiRollBarsRearMin = v.findViewById(R.id.nastr_poper_min2)
        antiRollBarsRearMax = v.findViewById(R.id.nastr_poper_max2)
        antiRollBarsRearResult = v.findViewById(R.id.nastr_poper_result2)

        springsFrontMin = v.findViewById(R.id.nastr_poper_min3)
        springsFrontMin?.addTextChangedListener(this)
        springsFrontMax = v.findViewById(R.id.nastr_poper_max3)
        springsFrontMax?.addTextChangedListener(this)
        springsFrontResult = v.findViewById(R.id.nastr_poper_result3)

        springsRearMin = v.findViewById(R.id.nastr_poper_min4)
        springsRearMin?.addTextChangedListener(this)
        springsRearMax = v.findViewById(R.id.nastr_poper_max4)
        springsRearMax?.addTextChangedListener(this)
        springsRearResult = v.findViewById(R.id.nastr_poper_result4)

        dampingFrontMin = v.findViewById(R.id.nastr_poper_min5)
        dampingFrontMin?.addTextChangedListener(this)
        dampingFrontMax = v.findViewById(R.id.nastr_poper_max5)
        dampingFrontMax?.addTextChangedListener(this)
        dampingFrontResult = v.findViewById(R.id.nastr_poper_result5)

        dampingRearMin = v.findViewById(R.id.nastr_poper_min6)
        dampingRearMin?.addTextChangedListener(this)
        dampingRearMax = v.findViewById(R.id.nastr_poper_max6)
        dampingRearMax?.addTextChangedListener(this)
        dampingRearResult = v.findViewById(R.id.nastr_poper_result6)

        reboundStiffnessFront = v.findViewById(R.id.nastr_poper_rebound_front)
        reboundStiffnessFront?.addTextChangedListener(this)
        reboundStiffnessFrontResult = v.findViewById(R.id.nastr_poper_result7)

        reboundStiffnessRear = v.findViewById(R.id.nastr_poper_rebound_rear)
        reboundStiffnessRear?.addTextChangedListener(this)
        reboundStiffnessRearResult = v.findViewById(R.id.nastr_poper_result8)

        antiRollBarsFrontMin?.addTextChangedListener(this)
        antiRollBarsFrontMax?.addTextChangedListener(this)
        antiRollBarsRearMin?.addTextChangedListener(this)
        antiRollBarsRearMax?.addTextChangedListener(this)

        return v
    }

    override fun onClick(v: View?) {
        requireActivity().onBackPressed()
    }


    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

    }

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

    }

    override fun afterTextChanged(s: Editable?) {
        if (TextUtils.isEmpty(frontNagruz?.text.toString()) && TextUtils.isEmpty(
                antiRollBarsFrontMin?.text.toString()
            )
            || TextUtils.isEmpty(antiRollBarsFrontMax?.text.toString()) || TextUtils.isEmpty(
                antiRollBarsRearMin?.text.toString()
            )
            || TextUtils.isEmpty(antiRollBarsRearMax?.text.toString())
        )

        //Поперечные стабилизаторы передние
            if (frontNagruz!!.length() > 0 && antiRollBarsFrontMin!!.length() > 0 && antiRollBarsFrontMax!!.length() > 0) {
                val nubmerFrontNagruz = frontNagruz!!.text.toString().toDouble()
                val numberAntRollBarsFrontMin = antiRollBarsFrontMin!!.text.toString().toDouble()
                val numberAntRollBarsFrontMax = antiRollBarsFrontMax!!.text.toString().toDouble()
                val resultAntRollBarsFront =
                    (numberAntRollBarsFrontMax - numberAntRollBarsFrontMin) * nubmerFrontNagruz / 100 + numberAntRollBarsFrontMin
                antiRollBarsFrontResult!!.text = resultAntRollBarsFront.toString()
            }

        //Поперечные стабилизаторы задние
        if (frontNagruz!!.length() > 0 && antiRollBarsRearMin!!.length() > 0 && antiRollBarsRearMax!!.length() > 0) {
            val nubmerFrontNagruz = frontNagruz!!.text.toString().toDouble()
            val numberAntRollBarsRearMin = antiRollBarsRearMin!!.text.toString().toDouble()
            val numberAntRollBarsRearMax = antiRollBarsRearMax!!.text.toString().toDouble()
            val resultAntRollBarsRear =
                (numberAntRollBarsRearMax - numberAntRollBarsRearMin) * (100 - nubmerFrontNagruz) / 100 + numberAntRollBarsRearMin
            antiRollBarsRearResult!!.text = resultAntRollBarsRear.toString()
        }

        //Пружины передние
        if (frontNagruz!!.length() > 0 && springsFrontMin!!.length() > 0 && springsFrontMax!!.length() > 0) {
            val nubmerFrontNagruz = frontNagruz!!.text.toString().toDouble()
            val numberSpringsFrontMin = springsFrontMin!!.text.toString().toDouble()
            val numberSpringsFrontMax = springsFrontMax!!.text.toString().toDouble()
            val resultSpringsFront =
                (numberSpringsFrontMax - numberSpringsFrontMin) * nubmerFrontNagruz / 100 + numberSpringsFrontMin
            springsFrontResult!!.text = resultSpringsFront.toString()
        }

        //Пружины задние
        if (frontNagruz!!.length() > 0 && springsRearMin!!.length() > 0 && springsRearMax!!.length() > 0) {
            val nubmerFrontNagruz = frontNagruz!!.text.toString().toDouble()
            val numberSpringsRearMin = springsRearMin!!.text.toString().toDouble()
            val numberSpringsRearMax = springsRearMax!!.text.toString().toDouble()
            val resultSpringsRear =
                (numberSpringsRearMax - numberSpringsRearMin) * (100 - nubmerFrontNagruz) / 100 + numberSpringsRearMin
            springsRearResult!!.text = resultSpringsRear.toString()
        }

        //Амортизация передняя
        if (frontNagruz!!.length() > 0 && dampingFrontMin!!.length() > 0 && dampingFrontMax!!.length() > 0) {
            val nubmerFrontNagruz = frontNagruz!!.text.toString().toDouble()
            val numberDampingFrontMin = dampingFrontMin!!.text.toString().toDouble()
            val numberDampingFrontMax = dampingFrontMax!!.text.toString().toDouble()
            val resultDampingFront =
                (numberDampingFrontMax - numberDampingFrontMin) * nubmerFrontNagruz / 100 + numberDampingFrontMin
            dampingFrontResult!!.text = resultDampingFront.toString()
        }

        //Амортизация задняя
        if (frontNagruz!!.length() > 0 && dampingRearMin!!.length() > 0 && dampingRearMax!!.length() > 0) {
            val nubmerFrontNagruz = frontNagruz!!.text.toString().toDouble()
            val numberDampingRearMin = dampingRearMin!!.text.toString().toDouble()
            val numberDampingRearMax = dampingRearMax!!.text.toString().toDouble()
            val resultDampingRear =
                (numberDampingRearMax - numberDampingRearMin) * (100 - nubmerFrontNagruz) / 100 + numberDampingRearMin
            dampingRearResult!!.text = resultDampingRear.toString()
        }

        //Проценты от Отбой Передние
        if (reboundStiffnessFront!!.length() > 0) {
            val numberReboundStiffnessFront = reboundStiffnessFront!!.text.toString().toDouble()
            val procentReboundStiffnessFront = numberReboundStiffnessFront * 0.6
            reboundStiffnessFrontResult!!.text = procentReboundStiffnessFront.toString()
        }

        //Проценты от Отбой Задние
        if (reboundStiffnessRear!!.length() > 0) {
            val numberReboundStiffnessRear = reboundStiffnessRear!!.text.toString().toDouble()
            val procentReboundStiffnessRear = numberReboundStiffnessRear * 0.6
            reboundStiffnessRearResult!!.text = procentReboundStiffnessRear.toString()
        }
    }
}