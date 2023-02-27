package com.socialquantum.west

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.h995kiki5ki5ikik
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.codeCodegtgt
import com.socialquantum.west.gtjgtijgtgt.NJnfdrfrfrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class ThreeeeuuuuFragment : Fragment() {
    val gtgtgtgt by activityViewModel<NJnfdrfrfrf>(named("MainModel"))
    lateinit var countryDevgtgtgt: String
    lateinit var wvgtgttggt: String
    lateinit var appsgttggtgt: String
    private lateinit var mContextgtgtgt: Context

    val hy55hy59hy: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }

    private fun gthigthgtih() {
        findNavController().navigate(R.id.action_threeeeuuuuFragment_to_foururururuFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_threeeeuuuu, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gtgtgtgt.gtjoigtjiogtjiogtjiogtjoigtjigt.observe(viewLifecycleOwner) {
            if (it != null) {
                val h59hy95 = it.toString()
                hy55hy59hy.edit().putString("mainId", h59hy95).apply()
            }
        }

        gtgtgtgt.gtythyhyhy.observe(viewLifecycleOwner) {
            if (it != null) {

                countryDevgtgtgt = it.domusgeo
                appsgttggtgt = it.domusnumber
                wvgtgttggt = it.domusview

                hy55hy59hy.edit().putString(codeCodegtgt, countryDevgtgtgt).apply()
                hy55hy59hy.edit().putString(gtjigtjigtjigtjigt.nhyjiohyiohy5, appsgttggtgt).apply()
                hy55hy59hy.edit().putString(h995kiki5ki5ikik, wvgtgttggt).apply()

                hrfhirfhhrf()
            }
        }
    }

    private fun hrfhirfhhrf() {
        ghtghihtihgt()
    }

    private fun ghtghihtihgt() {
        gthigthgtih()
    }
}