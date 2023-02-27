package com.socialquantum.west

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.socialquantum.west.databinding.ActivityGamamammymymy2Binding
import com.socialquantum.west.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class GamamammymymyActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityGamamammymymy2Binding

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamamammymymy2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMakeDamage.setOnClickListener {
            if (counter == 3) {
                val intentttt = Intent(this, Gaammmerrrrr333Activity2::class.java)
                startActivity(intentttt)
                finish()
            } else {
                lifecycleScope.launch {
                    it.isEnabled = false
                    val bonus = Random.nextInt(from = 100, until = 1000)
                    Toast.makeText(this@GamamammymymyActivity2, "${bonus} points earned! Reloading...", Toast.LENGTH_SHORT).show()
                    delay(1500)
                    it.isEnabled = true
                    counter++
                }
            }

        }
    }
}