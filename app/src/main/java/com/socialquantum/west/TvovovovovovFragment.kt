package com.socialquantum.west

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.socialquantum.west.cefrfrfrfr.gtjigtjigtjigtjigt.gtgthtghgthugt
import com.socialquantum.west.gtjgtijgtgt.NJnfdrfrfrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class TvovovovovovFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tvovovovovov, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjgtigtjgtj = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        higthigtihgthgthgthgt()
    }

    private fun gthigthihhigthigt() {
        frrfhfrhihfhrfh()
    }

    private fun frrfhfrhihfhrfh() {
        findNavController().navigate(R.id.action_tvovovovovovFragment_to_threeeeuuuuFragment)
    }

    private lateinit var gtjgtigtjgtj: Context


    val gtjgtjogtjgti: SharedPreferences by inject(named("SharedPreferences"))
    val gtjiogtjgtjijgt by activityViewModel<NJnfdrfrfrf>(named("MainModel"))

    lateinit var gthguthgthugt: String

    private fun higthigtihgthgthgthgt() {
        gtjiogtjgtjijgt.nknvngthutghih.observe(viewLifecycleOwner) {
            if (it != null) {
                gthguthgthugt = it.hjujukiikikik
                gtjgtjogtjgti.edit().putString(gtgthtghgthugt, gthguthgthugt).apply()
                gthigthihhigthigt()
            }
        }
    }

}