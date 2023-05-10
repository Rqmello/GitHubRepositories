package com.example.githubrepositories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.githubrepositories.databinding.ActivityMainBinding
import com.example.githubrepositories.presentation.gitrepository.ListRepositoriesActivity

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mbtGitHubRepositoriesSearch.setOnClickListener {
            val selectedOption: Int = binding.rgSelectionTypes.checkedRadioButtonId
            val rdButton = findViewById<RadioButton>(selectedOption)
            val language = rdButton.text.toString()
            val langBundle = Bundle().apply {
                putString("lang", language)
            }
            val intent = Intent(applicationContext, ListRepositoriesActivity::class.java)
            intent.putExtras(langBundle)
            startActivity(intent)
        }
    }
}