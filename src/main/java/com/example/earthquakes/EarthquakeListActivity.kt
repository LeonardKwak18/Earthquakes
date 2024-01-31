package com.example.earthquakes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.earthquakes.databinding.ActivityEarthquakeListBinding

class EarthquakeListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEarthquakeListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityEarthquakeListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_earthquake_list)
    }
}