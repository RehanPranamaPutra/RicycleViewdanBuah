package com.rehan.apprehan

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.rehan.apprehan.Model.ModelBuku
import com.rehan.apprehan.adapter.BukuAdapter

class RecycleView : AppCompatActivity() {

    private lateinit var rv_data : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)

        rv_data = findViewById(R.id.rv_data)

        // kita bikin array data
        val listBuku = listOf(
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Rehan Pranama Putra"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "bakachi9"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Rehan Pranama Putra"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "bakachi9"),
            ModelBuku(judul = "Buku Android Kotlin 2024", penerbit = "Rehan Pranama Putra")
        )

        val nBukuAdapter = BukuAdapter(listBuku)
        rv_data.apply {
            layoutManager = LinearLayoutManager(this@RecycleView)
            adapter = nBukuAdapter
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }



}