package com.github.braddle.learning

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val pokemonList = MutableLiveData<List<Pokemon>>()

    fun getAllPokemon() {
        pokemonList.postValue(listOf(Pokemon("Bob")))
        pokemonList.postValue(listOf(Pokemon("Dave")))
        pokemonList.postValue(listOf(Pokemon("Sally")))
        pokemonList.postValue(listOf(Pokemon("Kelly")))
        pokemonList.postValue(listOf(Pokemon("Harry")))
        pokemonList.postValue(listOf(Pokemon("Mary")))
    }
}