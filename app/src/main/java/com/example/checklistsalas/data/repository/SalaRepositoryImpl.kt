package com.example.checklistsalas.data.repository

import com.example.checklistsalas.domain.model.Sala
import com.example.checklistsalas.domain.repository.SalaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class SalaRepositoryImpl : SalaRepository{
    private val salas =
        MutableStateFlow(listOf(
            Sala(1, "Sala 101","LQ", "1 andar", "SP"),
            Sala(2, "Sala 202", "EG", "2 andar", "RJ"),
            Sala(3, "Sala 303", "VM22", "3 andar", "SP")
        ))

    override fun getSalas(): Flow<List<Sala>> {
        return salas.asStateFlow()
    }

    override suspend fun atualizarSala(sala: Sala) {
        salas.value = salas.value.map {
            if(it.id == sala.id) sala else it
        }
    }
}