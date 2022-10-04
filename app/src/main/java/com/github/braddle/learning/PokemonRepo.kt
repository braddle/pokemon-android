package com.github.braddle.learning

class PokemonRepo {

    fun getPokemon() : List<Pokemon> {
        return listOf(
            Pokemon("Ann"),
            Pokemon("Bob"),
            Pokemon("Charlie"),
            Pokemon("Dave"),
            Pokemon("Eddie"),
            Pokemon("Fran"),
            Pokemon("Grace"),
            Pokemon("Howard"),
            Pokemon("Sally")
        )
    }
}