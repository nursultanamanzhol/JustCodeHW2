package kz.course.justcodehw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kz.course.justcodehw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Скрываем навигационную панель и часы
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)

// Если у вас есть ActionBar, скройте его
        supportActionBar?.hide()

    }
}