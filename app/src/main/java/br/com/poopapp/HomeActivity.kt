package br.com.poopapp

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.button_bounce)

        val cvPoop = findViewById<CardView>(R.id.cvPoop)
        cvPoop.setOnClickListener {
            it.isEnabled = false
            it.startAnimation(bounceAnimation)
            it.isEnabled = true
            val intent = Intent(this, PoopFormActivity::class.java)
            startActivity(intent)
        }

        val cvStats = findViewById<CardView>(R.id.cvStats)
        cvStats.setOnClickListener {
            it.isEnabled = false
            it.startAnimation(bounceAnimation)
            it.isEnabled = true
            val intent = Intent(this, StatsActivity::class.java)
            startActivity(intent)
        }
    }
}