package com.socialquantum.west

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.socialquantum.west.databinding.ActivityGaammmerrrrr3332Binding
import com.socialquantum.west.databinding.ActivityGamamammymymy2Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class Gaammmerrrrr333Activity2 : AppCompatActivity() {
    private lateinit var binding: ActivityGaammmerrrrr3332Binding

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGaammmerrrrr3332Binding.inflate(layoutInflater)
        setContentView(binding.root)

        frjrfigtiuhgthugthugt()

        binding.reloooad.setOnClickListener {
            val intentttt = Intent(this, GamamammymymyActivity2::class.java)
            startActivity(intentttt)
            finish()
        }
    }

    private fun frjrfigtiuhgthugthugt() {
        gthghuiufhhrf()

        gtjgtjiojiijjgti()
    }

    private fun gthghuiufhhrf() {
        Toast.makeText(this, "Game finished!", Toast.LENGTH_SHORT).show()
    }

    private fun gtjgtjiojiijjgti() {
        binding.reeesst.setOnClickListener {
            gjtgtjgtjigtjgt()
        }
    }

    private fun gjtgtjgtjigtjgt() {
        finish()
    }
}