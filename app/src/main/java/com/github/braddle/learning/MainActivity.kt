package com.github.braddle.learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pokemonRepo = PokemonRepo()
        val adapter = MainAdapter(pokemonRepo)

        val recyclerView = findViewById<RecyclerView>(R.id.pokemonList)
        recyclerView.adapter = adapter
    }


}