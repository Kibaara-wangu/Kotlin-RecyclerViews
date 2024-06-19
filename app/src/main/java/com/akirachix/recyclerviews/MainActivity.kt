package com.akirachix.recyclerviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


       val names = listOf("Anne","Bernice","Caro","Edith","Diana","Faith","Hellen","Jane","Anne","Mary","Esther","Simon","Joan","lane","Joshua","Elijah","Simon","Simon","Esther","Esther"
           ,"Paul","Joyce","Mellisa","Angel","Blessing","George","Claus","Rebeccah","John","Bernice","Barnice","Ben","Job")
        binding.rvNames.layoutManager = LinearLayoutManager(this)
        val namesAdapter = NamesRecyclerViewAdapter(names)
        binding.rvNames.adapter = namesAdapter
    }
}