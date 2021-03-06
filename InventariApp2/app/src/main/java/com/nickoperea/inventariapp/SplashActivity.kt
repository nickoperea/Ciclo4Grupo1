package com.nickoperea.inventariapp

import android.animation.Animator
import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nickoperea.inventariapp.databinding.ActivitySplashBinding
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils


class SplashActivity : AppCompatActivity() {

   private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        binding.splashAnimation.startAnimation(animation)
        val intent = Intent(this, MainActivity::class.java)

        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {

            }

            override fun onAnimationEnd(animation: Animation?) {
              startActivity(intent)
                finish()
            }

            override fun onAnimationRepeat(animation: Animation?) {

            }
        })
    }

    }

