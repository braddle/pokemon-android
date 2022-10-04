package com.github.braddle.learning

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter (private val pokemonRepo: PokemonRepo) :
    RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    var pokemons: List<Pokemon>
    init {
        this.pokemons = pokemonRepo.getPokemon()
    }

    class  ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_pokemon, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name = pokemons[position].name
        Log.i("TESTING", "Position: " + position.toString())
        Log.i("TESTING", "Name: " + name)
        holder.textView.text = name
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }
}