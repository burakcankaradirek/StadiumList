package com.example.quiz5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var textViewStadiumCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        loadData()
    }
    private fun loadData() {
        val stadiums = StadiumRepository().getStadiums()

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val adapter = StadiumAdapter(this, stadiums)
        recyclerView.adapter = adapter
        textViewStadiumCount.text = stadiums.size.toString()
    }

    private fun initUI() {
        recyclerView = findViewById(R.id.recyclerView)
        textViewStadiumCount = findViewById(R.id.textViewStadiumCount)
    }

}
