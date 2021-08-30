package com.caf.mvvmcompose_pokemonapp.pokemondetail

import androidx.lifecycle.ViewModel
import com.caf.mvvmcompose_pokemonapp.data.remote.responses.Pokemon
import com.caf.mvvmcompose_pokemonapp.repository.PokemonRepository
import com.caf.mvvmcompose_pokemonapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }
}