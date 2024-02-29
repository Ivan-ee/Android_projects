package com.example.myapp

import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapp.databinding.ActivityMyBinding
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            var result: Int = binding.inputText.text.toString().toInt()

            when (result){
                in 0..1000 -> {
                    binding.tvResult.visibility = View.VISIBLE
                    binding.tvResult.text = "Вы маленький пидор!"
                }

                in 1000..10000 -> {
                    binding.tvResult.visibility = View.VISIBLE
                    binding.tvResult.text = "Вы пидор побольше!"
                }

                else -> {
                    binding.tvResult.visibility = View.VISIBLE
                    binding.tvResult.text = "Вы пидор Гигант!"
                }
            }
        }
    }


}
