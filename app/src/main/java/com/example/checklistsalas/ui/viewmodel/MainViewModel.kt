package com.example.checklistsalas.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.checklistsalas.domain.model.Sala
import com.example.checklistsalas.domain.repository.SalaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: SalaRepository
) : ViewModel(){

    val salas: StateFlow<List<Sala>> = repository
        .getSalas()
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(),
            emptyList()
        )
    fun marcarComoConcluida(sala: Sala) {
        viewModelScope.launch {
            repository.atualizarSala(sala.copy(checklistConcluido = true))
        }
    }
}